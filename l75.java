import java.util.Arrays;

public class l75 {

    public static void main(String[] args) {

        int[] arr = new int[]{2,0,2,1,1,0};

        sortColors(arr);

        System.out.println(Arrays.toString(arr));

    }
        
    
    static void sortColors(int[] nums){

        int start = 0, 
            end = nums.length - 1,
            mid = 0;


            while(mid <= end){

                switch(nums[mid]){

                    case 0:
                        switchNum(nums, start, mid);
                        start++;
                        mid++;
                        break;

                    case 1:
                        mid++;
                        break;

                    case 2:
                        switchNum(nums, mid, end);
                            end--;
                            break;
                }
            }



        
    }




    static void switchNum(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }







 
}
