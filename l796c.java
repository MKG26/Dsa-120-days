public class l796c {

    public static void main(String[] args) {

        System.out.println(rotateString("abcde", "bcdea"));
    }

    public static boolean rotateString(String s, String goal) {

        StringBuilder sb = new StringBuilder(s);

        for(int i=0; i<s.length(); i++){

            char f = sb.charAt(0);
            for(int j =1; j<s.length(); j++){

                char t = sb.charAt(j);
                sb.setCharAt(j-1, t);
            }

            sb.setCharAt(s.length()-1, f);

            if(sb.toString().equals(goal)){
                return true;
            }
        }

        return false;
    }
}
