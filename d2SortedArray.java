import java.util.Arrays;

public class d2SortedArray {

    public static void main(String args[]){
    
        int[][] arr = {
            {10,20,30,40},
            {11,21,31,41},
            {12,22,32,42},
            {13,23,33,43}
        };

        System.out.println(Arrays.toString(search(arr,44)));

    }

    static int[] search(int[][] arr, int target){

        int row = 0;
        int col = arr.length -1;

            while(row<arr.length && col>=0){

        if(arr[row][col] == target){
            return new int[]{row,col};
        }
        else if(arr[row][col]<target){
            row++;
        }
        else{
            col--;
        }
    }

    return new int[]{-1,-1};

}
    
}
