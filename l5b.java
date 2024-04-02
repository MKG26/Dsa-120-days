public class l5b {
    public static void main(String[] args) {


        System.out.println(longestPalindrome("baab"));
    }

    public static String longestPalindrome(String s) {

        if(s.length() == 1){

            return s;
        }

        int start = 0;
        int end = 0;

        for(int i=0; i<s.length(); i++){

            int len1 = expandFromMiddle(s, i,i);
            int len2 = expandFromMiddle(s, i, i+1);

            int len = Math.max(len1, len2);

            if(len > end - start +1){

                start = i - ((len-1)/2);
                end = i +(len/2);
            }

        }

        return s.substring(start, end+1);

    }

    static int expandFromMiddle(String s, int left, int right){

        if(left > right){
            return 0;
        }

        while(left >= 0 && right <= s.length()-1 && s.charAt(left) == s.charAt(right)){

            left--;
            right++;
        }

        return right - left -1;
    }
}
