import java.util.Arrays;

public class l493 {

    public static void main(String[] args) {

        System.out.println(reversePairs(new int[]{1,3,2,3,1}));
    }

    public static int reversePairs(int[] nums) {




        int i=0;
        int j= nums.length-1;

        int count = 0;


        while(i<j){

            while(i<nums.length && i<j){
                if (nums[i] > 2 * nums[j]) {

                    count++;

                    i++;

                }else{
                    i++;
                }


            }

            j--;
            i=0;



        }

        return count;

    }
}
