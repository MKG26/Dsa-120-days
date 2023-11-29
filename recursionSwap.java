import java.util.Arrays;

public class recursionSwap {
    
    public static void main(String args[]){
    
        int[] arr = {1,2,3,4,5};

        System.out.println(Arrays.toString(rec(arr)));
    
    }

    static int[] rec(int[] arr){

        int start = 0;
        int end = arr.length-1;
        swapping(start, end, arr);

        return arr;

    }

    static void swapping(int start, int end , int[] arr){

        if(start > end){
            return;
        }

        swap(start,end, arr);

        

        swapping(start+1, end-1, arr);
    }

    static void swap(int start, int end, int[] arr){

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
