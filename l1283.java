public class l1283 {

    public static void main(String[] args) {

        int[] arr = {44,22,33,11,1};

        System.out.println(smallestDivisor(arr, 5));
    }

    public static int smallestDivisor(int[] nums, int threshold) {

        int min = 1;

        int max = maxEle(nums);

        int ans = 0;

        while(min <= max){

            int mid = min + ((max-min)/2);

            if(possible(nums, mid, threshold)){



                ans = mid;

                max = mid -1;

            }
            else{
                min = mid +1;
            }
        }

        return ans;
    }

    private static int maxEle(int[] nums) {

        int max = nums[0];

        for(int i:nums){
            if(i>max){
                max = i;
            }
        }


        return max;
    }

    private static boolean possible(int[] nums, int mid, int threshold) {

        int count =0;

        for(int i=0; i< nums.length; i++){

            count += (nums[i]+mid-1)/mid;

        }

        if(count <= threshold){
            return true;
        }

        return false;
    }
}
