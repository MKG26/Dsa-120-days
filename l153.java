public class l153 {
    
    public static void main(String args[]){
    
        int[] nums = {3,4,5,1,2};


        System.out.println(findMin(nums));
    
    }

    static int findMin(int[] nums) {
        
        int pivot = pivot(nums);

        if(pivot == -1){

            return nums[0];
        }
        else{
            return nums[pivot+1];
        }
    }

    static int pivot(int[] nums){

        int start = 0;
        int end = nums.length-1;

        while(start<=end){

            int mid = start + ((end-start)/2);

            if(nums[mid]<nums[mid-1]){
                return mid-1;
            }
            else if(nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(nums[start]>nums[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return -1;
    }
}
