import java.util.*;


public class rotate90 {
    public static void rotate(int[][] matrix) {

     int row = matrix.length;
     int col = matrix[0].length;

     int[][] ans = new int[row][col];

     for(int i=0; i<row; i++){

         for(int j=0; j<col; j++){

             ans[j][(col-1)-i]= matrix[i][j];
             
         }
     }

     for(int i=0; i<row; i++){

         for(int j=0; j<col; j++){

             System.out.print(ans[i][j]+ " ");
         }

         System.out.println();
     }

    }

    
    public static void main(String args[]){
    
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

         rotate(matrix);
    
    }
}