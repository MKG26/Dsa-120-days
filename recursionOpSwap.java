import java.util.Arrays;

public class recursionOpSwap {

    public static void main(String args[]){
    
        int[] arr = {1,2,3,4,5};

        f(0, arr.length, arr);

        System.out.println(Arrays.toString(arr));
    
    }

    static void f(int i, int n, int[] arr){

        if(i>n/2){
            return;
        }

        swap(i, n-1-i, arr);

        f(i+1, n, arr);
    }

    static void swap(int i, int n, int[] arr){

        int temp = arr[i];
        arr[i] = arr[n];
        arr[n] = temp;
    }
    


}
