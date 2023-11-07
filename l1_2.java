import java.util.Arrays;

public class l1_2 {
   
    public static void main(String args[]){
        
        int[] arr = {1,2,3,4,5};

 

        System.out.println(Arrays.toString(twoSum(arr, 8)));
        
    
    }
   
   
    public static int[] twoSum(int[] nums, int target) {
        

        Arrays.sort(nums);

        int start = 0; 
        int end = nums.length -1;

        while(start<end){

            if(nums[start]+nums[end] > target){
                end--;
            }
            else if(nums[start]+nums[end] < target){
                start++;
            }
            else{
                return new int[]{start,end};
            }
        }

        return new int[]{-1,-1};
    }
}
