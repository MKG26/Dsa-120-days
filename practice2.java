import java.util.Arrays;
import java.util.Scanner;

public class practice2 {
    
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][2];


            for(int i=0 ; i<arr.length; i++){
                for(int j=0; j<arr[i].length; j++){

                    arr[i][j] = sc.nextInt();
                }
            }
             
             
             
             for(int row=0; row<arr.length; row++){

                System.out.println(Arrays.toString(arr[row]));
             }
    }
}
