public class l1781 {

    public static void main(String[] args) {


        System.out.println(beautySum("aaac"));
    }

    public static int beautySum(String s) {

        int ans = 0;

        char[] st = s.toCharArray();

        for(int size = 3; size <= s.length(); size++ ){

            int[] freq = new int[26];

            int i=0;
            int j = size;

            for(int k=i; k < j; k++ ){

                freq[st[k] - 'a']++;
            }

            ans += beauty(freq);

            while(j < s.length()){

                freq[st[i] - 'a']--;
                freq[st[j] - 'a']++;

                ans += beauty(freq);

                i++;
                j++;
            }
        }

        return ans;

    }

    static int beauty(int[] freq){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i : freq){

            if(i != 0){

                min = Math.min(min,i);
                max = Math.max(max,i);
            }


        }

        return max - min;
    }
}
