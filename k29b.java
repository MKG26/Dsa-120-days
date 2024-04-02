import java.util.Arrays;

public class k29b {

    public static void main(String[] args) {


        int[] arr = {5,4,3,2,1};

        reBubbleSort(arr, arr.length-1, 0);

        System.out.println(Arrays.toString(arr));
    }

    static void reBubbleSort(int[] arr, int r, int c){

        if(r==0){
            return;
        }

        if(c<r){

            if(arr[c] > arr[c+1]){

                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }

            reBubbleSort(arr, r, c+1);
        }
        else{

            reBubbleSort(arr, r-1, 0 );

        }
    }
}
