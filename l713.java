public class l713 {

    public static void main(String[] args) {

        int[] arr = {10,5,2,6};

        System.out.println(numSubarrayProductLessThanK(arr, 100));
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {



        int left = 0;
        int right = 0;


        int result = 0;

        int prod = 1;

        while(right < nums.length){

            prod = prod * nums[right];

            while(prod >= k){

                prod = prod / nums[left];
                left++;
            }

            result += right - left + 1;
            right++;
        }

        return result;
    }
}
