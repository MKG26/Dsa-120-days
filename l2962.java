public class l2962 {


    public static void main(String[] args) {

        int[] arr = {1,3,2,3,3};

        int k = 2;

        System.out.println(countSubarrays(arr, k));
    }


    public static long countSubarrays(int[] nums, int k) {

        int maxEle = Integer.MIN_VALUE;

        for(int i=0 ; i<nums.length ; i++){

            maxEle = Math.max(maxEle , nums[i]);

        }

        int start = 0;
        int end = 0;
        long count = 0;
        int maxEleCount = 0;

        while(end < nums.length){

            if(nums[end] == maxEle){

                maxEleCount++;
            }

            while (maxEleCount == k){

                count = count + (nums.length - end);

                if(nums[start] == maxEle){
                    maxEleCount--;
                }
                start++;
            }
            end++;
        }

        return count;
    }
}
