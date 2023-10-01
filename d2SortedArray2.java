import java.util.Arrays;

public class d2SortedArray2 {

    public static void main(String args[]) {


        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        System.out.println(Arrays.toString(search(arr, 15)));

    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd , int target){

        while(cStart<=cEnd){
            
            int mid = cStart+(cEnd-cStart)/2;

            if(target == matrix[row][mid]){
                return new int[]{row,mid};
            }

            else if(target>matrix[row][mid] ){
                cStart = mid++;
            }else{
                cEnd = mid--;
            }
        }

        return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
                return binarySearch(matrix, 0, 0, cols-1, target);
         }

         int rStart = 0;
         int rEnd = rows - 1;
         int col = cols/2;

         while(rStart <(rEnd-1)){

            int mid = rStart + (rEnd-rStart)/2;


            if(matrix[mid][col] == target){
                return new int[]{mid,col};
            }

            else if(matrix[mid][col] < target){
                rStart = mid;
            }
            else{
                rEnd = mid;
            }
         }

         if(matrix[rStart][col] == target){
            return new int[]{rStart,col};
         }
         else if(matrix[rStart+1][col] == target){
            return new int[]{rStart+1,col};
         }


         if(matrix[rStart][col] < target && target< matrix[rStart][cols-1]){
            return binarySearch(matrix, rStart, col+1, cols-1, target);
         }

         else if(matrix[rStart][col] > target){
            return binarySearch(matrix, rStart, 0, col-1, target);
         }

         else if(matrix[rStart+1][col] > target){
            return binarySearch(matrix, rStart+1, 0, col-1, target);
         }
         else{
            return binarySearch(matrix, rStart+1, col+1, cols-1, target);
         }


    }
}
