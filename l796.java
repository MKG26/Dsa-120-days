import java.util.Arrays;

public class l796 {

    public static void main(String[] args) {

        System.out.println(rotateString("abcde", "cdeab"));
    }

    public static boolean rotateString(String s, String goal) {


        int n = s.length();
        char[] first = s.toCharArray();
        char[] second = new char[s.length()];
        char[] third = goal.toCharArray();

        for(int i=0; i<n; i++ ){

            for(int j=1; j<n; j++){



                second[j-1] = first[j];

            }

            second[n -1] = first[0];

            s = Arrays.toString(second);

            goal = Arrays.toString(third);


            if(s.equals(goal)){
                return true;
            }else{
                for(int j=0; j<n; j++){

                    first[j] = second[j];
                }
            }




        }

        return false;

    }
}

