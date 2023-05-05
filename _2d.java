import java.util.*;
import java.util.Scanner;



public class _2d {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

            int arr[][] ={{1,2,3,4},{5,6,7,8},{9,10,11,12}} ;

        

            //row wise input
            // for(int i=0; i<3; i++){
            //     for(int j=0; j<4; j++){
            //         arr[i][j]=sc.nextInt();
            //     }
            // }

            // //coloumn wise input
            // for(int i=0; i<4; i++){
            //     for(int j=0; j<3; j++){
            //         arr[j][i]=sc.nextInt();
            //     }
            // }


            // for(int i=0; i<3; i++){
            //     for(int j=0; j<4; j++){
            //         System.out.print(arr[i][j]+" ");
            //     }
            //     System.out.println();
            // }
        
                // boolean ans =  isPresent(arr,45,3,4);

                // if(ans == true){
                //     System.out.println("Element Found");
                // }
                // else{
                //     System.out.println("Not Found");
                // }

                    rowSum(arr,3,4);

            }        
    
    

        public static boolean isPresent(int arr[][],int target, int row, int col ){

            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    if(arr[i][j]==target){
                        return true;
                    }
                }
            }

            return false;

    }

    public static void rowSum(int arr[][],int row,int col){

        for(int i=0;i<row;i++){
            int sum =0;
            for(int j=0;j<col;j++){
                sum += arr[i][j];
            }
                System.out.println(sum);
        }
    }
}