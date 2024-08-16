import java.util.Arrays;

public class l283 {

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};

        moveZeroes(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void moveZeroes(int[] nums){

        int insertPosition = 0;

        for(int i =0 ; i< nums.length; i++){

            if(nums[i] != 0){

                nums[insertPosition++] = nums[i];
            }
        }



        while(insertPosition < nums.length){

            nums[insertPosition++] = 0;
        }
    }
    
}
