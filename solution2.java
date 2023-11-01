import java.util.Arrays;

public class solution2 {
    

    public static void main(String args[]){
    
        int[] nums = {100,4,200,1,3,2};

        

        System.out.println(longestConsecutive(nums));
    
    }

    static int longestConsecutive(int[] nums){

        
        sort(nums);
        
        int longest = 1;
        int lastSmaller = Integer.MIN_VALUE;
        int count = 0;
        
        for(int i=0; i<nums.length; i++){

            if(nums[i] -1 == lastSmaller){
                count++;
                lastSmaller = nums[i];
            }
            else if(lastSmaller != nums[i])
            {
                count = 1;   
                lastSmaller = nums[i];
            }

            longest = Math.max(longest, count);
        }

        return longest;
        
    }
   
   
    static void sort(int[] nums){

        for(int i=0 ; i<nums.length; i++)
            {
                int last = nums.length - i -1;

                int maxIndex = maxIndex(nums, 0 , last);

                swap(nums, maxIndex, last);


            }
    }

    static void swap(int[] nums, int maxIndex, int last){

        int temp = nums[maxIndex];
        nums[maxIndex] = nums[last];
        nums[last] = temp;
    }

    static int maxIndex(int[] nums, int start , int end){

        int max = 0;

        for(int i=start; i<=end ; i++ ){

            if(nums[max] < nums[i]){
                max = i;
            }
        }

        return max;
    }
}
