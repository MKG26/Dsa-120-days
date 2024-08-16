import java.util.Arrays;

class l26{

public static void main(String[] args) {

        int arr[] = {1,1,2,2,3};

        int count = removeDuplicates(arr);

        System.out.println(Arrays.toString(arr) + " " + count);


    }



    static int removeDuplicates(int[] nums) {

        int count = 0;

        for(int i=0; i<nums.length-1; i++){

            if(nums[i] != nums[i+1]){

                nums[count++] = nums[i];
            }
            else{
                continue;
            }
        }


        nums[count++] = nums[nums.length-1];
        return count;

    }

}