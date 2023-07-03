import javax.sound.sampled.*;

public class scream {
    public static void main(String[] args) {
        try {
            AudioFormat format = new AudioFormat(44100, 16, 1, true, true);
            DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);
            TargetDataLine line = (TargetDataLine) AudioSystem.getLine(info);

            line.open(format);
            line.start();

            System.out.println("Welcome to the Scream-O-Meter!");
            System.out.println("Let's measure the loudness of your scream.");

            byte[] buffer = new byte[4096];
            int bytesRead;

            System.out.print("Press Enter to start recording...");
            System.in.read();

            System.out.println("Recording...");

            line.read(buffer, 0, buffer.length);

            System.out.println("Recording finished.");

            // Calculate the loudness based on the captured audio data
            long totalSquared = 0;
            for (byte b : buffer) {
                int sample = b;
                totalSquared += sample * sample;
            }

            double rms = Math.sqrt(totalSquared / buffer.length);
            double decibels = 20 * Math.log10(rms / 32767.0);

            System.out.println("\nScream Report:");
            System.out.println("Decibels: " + decibels + " dB");

            if (decibels <= 30) {
                System.out.println("Volume Level: Whisper");
            } else if (decibels <= 60) {
                System.out.println("Volume Level: Normal conversation");
            } else if (decibels <= 90) {
                System.out.println("Volume Level: Busy street");
            } else if (decibels <= 120) {
                System.out.println("Volume Level: Rock concert");
            } else {
                System.out.println("Volume Level: Jet engine");
            }

            line.stop();
            line.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
