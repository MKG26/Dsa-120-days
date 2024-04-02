import java.util.Arrays;

public class l1838 {

    public static void main(String[] args) {

        int[] nums = {1,2,4};

        System.out.println(maxFrequency(nums, 5));
    }

    public static int maxFrequency(int[] nums, int k) {

        int left =0;
        int rigth = 0;

        int ans = 0;
        long sum = 0;

        Arrays.sort(nums);

        while(rigth < nums.length){

            sum += nums[rigth];

            while((long)nums[rigth]*(rigth-left+1) > sum + k){

                sum -= nums[left];
                left++;
            }


            ans = Math.max( ans, (rigth-left+1));
            rigth++;
        }


        return ans;




    }
}


