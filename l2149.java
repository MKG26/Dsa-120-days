import java.util.Arrays;

public class l2149 {

    public static void main(String args[]){
    
        int[] arr = {3,1,-2,-5,2,-4};

        System.out.println(Arrays.toString(rearrangeArray(arr)));
    
    }

    public static int[] rearrangeArray(int[] nums) {
        



       

        int countP = 0;
        int countN = 1;

        int[] ans = new int[nums.length]; 

        for(int i=0; i<nums.length; i++){

            if(nums[i] > 0){
                ans[countP] = nums[i];
                countP+=2;
            }

            else{
                ans[countN] = nums[i];
                countN+=2;
            }

        }

     




        return ans;
        
    }


    
}
