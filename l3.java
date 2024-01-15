import java.util.HashMap;
import java.util.HashSet;

public class l3 {

    public static void main(String[] args) {


        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {

        HashSet<Character> hs = new HashSet<>();


        char[] arr = s.toCharArray();

        int a = 0;
        int b = 0;
        int max = 0;

        while (b < s.length()) {

            if (!hs.contains(arr[b])) {

                hs.add(arr[b]);
                b++;
                max = Math.max(hs.size(), max);
            } else {

                hs.remove(arr[a]);
                a++;

            }
        }


        return max;


    }
}