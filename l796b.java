public class l796b {

    public static void main(String[] args) {

        System.out.println(rotateString("abcde", "bcdea"));

    }

    public static boolean rotateString(String s, String goal) {


        StringBuilder sb = new StringBuilder(s);

        for(int i=0; i<s.length(); i++){

            char l = sb.charAt(s.length()-1);
            for(int j=s.length()-1; j>0; j--){

                char t = sb.charAt(j-1);
                sb.setCharAt(j,t);

            }
            sb.setCharAt(0,l);

            if(sb.toString().equals(goal)){

                return true;
            }
        }

        return false;

    }
}
