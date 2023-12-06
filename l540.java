public class l540 {
    
    public static void main(String args[]){
    
        int arr[] = {1,1,2,3,3,4,4,8,8};
    
        System.out.println(singleNonDuplicate(arr));
    }

    static int singleNonDuplicate(int[] nums) {
        
        for(int i=1; i<nums.length; i++){

            if(i == nums.length-1 && nums[i] != nums[i-1]
 ){
                return nums[i];
            }
            
            if(i<nums.length-1)
             {if(nums[i] == nums[i+1] || nums[i-1] == nums[i]){
                
            }
            else{
                return nums[i];
            }}
          
        }

        
        
        if(nums.length ==1){
            return nums[0];
        }

        if(nums[0] != nums[1]){
            return nums[0];
        }

        return -1;
        
    }
}
