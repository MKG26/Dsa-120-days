import java.io.OutputStream;
import java.util.*;
import java.util.Scanner;

public class spiral {

    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    int row = sc.nextInt();
    int cols = sc.nextInt();

    int matrix[][] = new int[row][cols];

    for(int i=0;i<row;i++){
        for(int j=0;j<cols;j++){
            matrix[i][j]=sc.nextInt();
        }
    }

    System.out.println("The matrix is");

    for(int i=0;i<row;i++){
        for(int j=0;j<cols;j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }

   

        int startrow = 0;
        int endrow   = row-1;
        
        int startcol = 0;
        int endcol   = cols-1;

        while(startrow<endrow&&startcol<endcol){
        
        for(int i=0;i<cols;i++){
            System.out.print(matrix[startrow][i]+" ");
        }

        startrow++ ;

        for(int i=startrow;i<row;i++){
            System.out.print(matrix[i][endcol]+" ");
        }

        endcol--;

        for(int i=endcol;i>=0;i--){
            System.out.print(matrix[endrow][i]+" ");
        }

        endrow--;

        for(int i=endrow;i>=startrow;i--){
            System.out.print(matrix[i][startcol]+" ");
        }

        startcol++;

        for(int i=startcol;i<=endcol;i++){
            System.out.print(matrix[startrow][i]);
        }

    }


    
    
    }
}

