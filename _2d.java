import java.util.*;
import java.util.Scanner;



public class _2d {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

            int arr[][] = new int[3][4];

            //row wise input
            // for(int i=0; i<3; i++){
            //     for(int j=0; j<4; j++){
            //         arr[i][j]=sc.nextInt();
            //     }
            // }

            //coloumn wise input
            for(int i=0; i<4; i++){
                for(int j=0; j<3; j++){
                    arr[j][i]=sc.nextInt();
                }
            }


            for(int i=0; i<3; i++){
                for(int j=0; j<4; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        
    
    }
}