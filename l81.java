public class l81 {

    public static void main(String args[]){
    
        int[] nums = {1,1,1,1,1,1,1,1,1,13,1,1,1,1,1,1,1,1,1,1,1,1};


        

        System.out.println(search(nums, 13));
    
    }

    static boolean search(int[] nums, int target) {

        if(nums.length == 1){
            if(target != nums[0]){
                return false;
            }
            else{
                return true;
            }
        }
        
        int pivot = pivot(nums);
        
        if(pivot == -1){
            return binarySearch(nums, 0, nums.length-1, target);

        }

        if(nums[0] <= target ){

            return binarySearch(nums, 0, pivot, target);

        }
        else {
            return binarySearch(nums, pivot+1, nums.length-1, target);
        }




            
    }

    static int pivot(int[] nums){

        int start = 0;
        int end = nums.length-1;

        while(start<=end){

            int mid = start + ((end-start)/2);

            if(mid<nums.length-1 && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(mid>0 && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            else if(nums[mid]<nums[start]){
                end = mid - 1;
            }
            else{
                start = mid +1;
            }
            
        }

        return -1;
    }

    static boolean binarySearch(int[] nums, int start, int end, int target){

        

        while(start<= end){
            int mid = start +((end - start)/2);

            if(nums[mid] < target){

                start= mid+1;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                return true;
            }

        }

        return false;
    }
    
}
