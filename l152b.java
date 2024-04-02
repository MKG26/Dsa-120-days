public class l152b {

    public static void main(String[] args) {

        System.out.println(maxProduct(new int[]{2,3,-2,4}));
    }

    public static int maxProduct(int[] nums) {

        int prefix = 1;
        int suffix = 1;

        int max = Integer.MIN_VALUE;


        for(int i=0; i< nums.length-1; i++){

            prefix *= nums[i];
            suffix *= nums[nums.length-i-1];

            max = Math.max(max, Math.max(prefix,suffix));

            if(prefix == 0 ) prefix =1;
            if(suffix == 0) suffix =1;

        }


        return max;
    }
}
