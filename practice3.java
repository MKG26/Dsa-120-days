import java.util.Arrays;

public class practice3 {
    

    public static void main(String args[]){
    
        int[] nums = {100,4,200,1,3,2};
        
        int ans = longestConsecutive(nums);
        
        System.out.println(ans);

    }

    
    
    static int longestConsecutive(int[] nums) {
        
        int ans = 0;
        
        for(int i=0; i<nums.length; i++){

           int j = 0; 

           int count = 0;

           

            int value = nums[i];

            while(true){

               

                if(search(nums,value )){
                    count++;
                    
                    value++;
                }
                else{
                    break;
                }

            }

            if(ans<count){
                ans = count;
            }

         
            


        }

        return ans;

   
}

    static boolean search(int[] nums, int ans){

        for(int i=0; i<nums.length ; i++){

            if(nums[i] == ans){
                return true;
            }
        }

        return false;
    }

}
