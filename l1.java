import java.util.Arrays;
import java.util.HashMap;

public class l1 {
    
   public static void main(String args[]){
   
        int[] arr = {1,2,3,4,5};

 

        System.out.println(Arrays.toString(twoSum(arr, 8)));
   
   }
   
   
   
   
    public static int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();

        
   

        
        
        
        for(int i=0; i<nums.length; i++){

            int value = target - nums[i];

         

            if(hm.containsKey(value)){

                return new int[]{hm.get(value),i};
            }

        else{
            hm.put(nums[i], i);
        }
            
        }

        return new int[]{-1,-1};

        
    }
}
