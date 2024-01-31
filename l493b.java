import java.util.Arrays;

public class l493b {

    public static void main(String[] args) {

        System.out.println(reversePairs(new int[]{1,3,2,3,1}));
    }

    public static int reversePairs(int[] nums) {

        int i=0;
        int j= nums.length-1;

        int count = 0;


        while(i<j){


                if (nums[i] > 2 * nums[j]) {

                    count++;

                    i++;

                }


                else if(nums[i]/2 < nums[j]){

                    count++;
                    j--;

                }
                else {

                    i++;
                    j--;
                }


 




        }

        return count;

    }
}
