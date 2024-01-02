public class l5 {
    public static void main(String[] args) {

        System.out.println(longestPalindrome("babad"));
    }

    public static String longestPalindrome(String s) {

        s = s.trim();

        if(s.length() == 1){
            return s;
        }

        char[] ans = s.toCharArray();

        String sb = "";

        int count = 0;

        Boolean ss = true;


        for(int i=0; i<s.length()-1;i++){

            for(int j = i+1; j<s.length(); j++){

                if(ans[i] == ans[j]){

                    if(search(ans, i+1, j-1)){

                        ss = false;

                        String temp = s.substring(i, j+1);

                        if(count < temp.length()){
                            count = temp.length();

                            sb = temp;
                        }

                    }

                }


            }
        }

        if(ss){
            return Character.toString(s.charAt(0));
        }

        return sb;



    }


    static boolean search(char[] s, int i, int j){


        while(i <= j){

            if(s[i] == s[j]){

                i++;
                j--;
            }
            else{
                return false;
            }

        }

        return true;
    }
}
