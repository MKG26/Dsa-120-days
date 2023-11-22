public class l53 {
    public static void main(String args[]){
    
        int[] arr = {-2,-1};
        
        System.out.println(maxSubArray(arr));
        
    }

    public static int maxSubArray(int[] nums) {
        
        if(nums.length == 1){
            return nums[0];
        }

        int max = nums[0];
        
        for(int i=0; i<nums.length ; i++){

            int sum = 0;

            for(int j=i ; j<nums.length; j++){

                sum = sum + nums[j];

                if(max < sum){
                    max = sum;
                }
                
            }

            
      }



      return max;
        
    }
}
