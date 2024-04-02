public class l152 {

    public static void main(String[] args) {

        System.out.println(maxProduct(new int[] { 2,3,-2,4}));


    }

    public static int maxProduct(int[] nums) {

        int max = Integer.MIN_VALUE;


        for(int i=0; i< nums.length; i++){


            int product = 1;
            for(int j=i; j< nums.length; j++){

                product *= nums[j];

                max = Math.max(max, product);

            }
        }

        return max;
    }
}
