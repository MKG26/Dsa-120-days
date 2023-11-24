import java.util.Arrays;

public class l2149 {

    public static void main(String args[]){
    
        int[] arr = {3,1,-2,-5,2,-4};

        System.out.println(Arrays.toString(rearrangeArray(arr)));
    
    }

    public static int[] rearrangeArray(int[] nums) {
        

        int size = nums.length/2;

        int post[] = new int[size];

        int[] neg = new int[size];

        int countP = 0;
        int countN = 0;

        for(int i=0; i<nums.length; i++){

            if(nums[i] > 0){
                post[countP++] = nums[i];
            }
            else{
                neg[countN++] = nums[i];
            }
        }

     
        for(int i=0; i<nums.length/2; i++){

            nums[2*i] = post[i];

            nums[(2*i)+1] = neg[i];
        }



        return nums;
        
    }


    
}
