import java.util.Arrays;

public class l29c {

    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};

        reSelectionSort(arr,5,0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void reSelectionSort(int[] arr, int r, int c, int max){

        if(r == 0){
            return;
        }

        if(c<r){
            if(arr[c] > arr[max]){
                reSelectionSort(arr,r,c+1,c);
            }
            else{
                reSelectionSort(arr,r,c+1, max);
            }

        }
        else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;

            reSelectionSort(arr,r-1, 0,0);
        }
    }
}
