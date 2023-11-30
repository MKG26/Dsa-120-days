import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class l31 {
    
    public static void main(String args[]){
    
        int[] arr = {1,3,2};
    
        nextPermutation(arr);
    }

    public static void nextPermutation(int[] nums) {
        
        int index = -1;
        int n = nums.length;

        for(int i = n-2; i>=0 ; i-- ){

            if(nums[i] < nums[i+1]){

                index = i;
                break;
            }
        }

        for(int i= n-1; i>index; i--){

            if(nums[index] < nums[i]){

                swap(nums, index, i);
                break;
            }
        }


        Arrays.sort(nums, index+1, n);


        System.out.println(Arrays.toString(nums));
    }

    static void swap(int[] arr, int first, int sec){

        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }
}
