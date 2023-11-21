import java.util.Arrays;
import java.util.HashMap;

public class l136 {
        public static void main(String args[]){
        
            int[] arr = {1,1,2};

            System.out.println(singleNumber(arr));
        
        }

        public static int singleNumber(int[] nums) {
            

            HashMap<Integer,Integer> hm = new HashMap<>();

            for(int i=0; i<nums.length; i++){

                if(hm.containsKey(nums[i])){

                    hm.put(nums[i], hm.get(nums[i])+1);
                }
                else{
                    hm.put(nums[i], 1);
                }
            }

            for(int i=0; i<nums.length; i++){

                if(hm.get(nums[i]) == 1){

                    return nums[i];
                }
            }

            return -1;
           
        }
}
