public class l1143 {

    public static void main(String[] args) {


        System.out.println(longestCommonSubsequence("abcde", "fgcde"));
    }

    public static int longestCommonSubsequence(String text1, String text2) {

       int ans =  findNum(text1.length()-1, text2.length()-1, text1, text2);


        return ans;
    }

    static int findNum(int ind1, int ind2, String text1, String text2){


        if(ind1 < 0 || ind2 < 0){

            return 0;
        }

        if(text1.charAt(ind1) == text2.charAt(ind2)){

            return 1 + findNum(ind1-1, ind2-1, text1, text2);
        }


            return Math.max(findNum(ind1-1, ind2, text1, text2), findNum(ind1, ind2-1, text1, text2));



    }



}
