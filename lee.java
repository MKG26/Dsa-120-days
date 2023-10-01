import java.util.Arrays;

public class lee {

    public static void main(String args[]){
    
        int[] arr = {1,2,3,4};


        int[][] hh = new int[2][];


        hh= form(arr);

for(int r = 0; r<2 ; r++){
            for(int c = 0; c<2; c++){

                System.out.print(hh[r][c]);
            }
            System.out.println();
        }
        

        


        
    }

    static int[][] form(int[] arr ){


        
        int[][] arrr = new int[2][2];
        int temp = 0;
        
        for(int r = 0; r<2 ; r++){
            for(int c = 0; c<2; c++){

                arrr[r][c] = arr[temp++]; 
            }
        }


        return arrr;
            // for(int i=0; i<2; i++){
            //     for(int j =0; j<2;j++){
            //         System.out.print(arrr[i][j]+" ");
            //     }
            //     System.out.println();
            // }
    }
    
}
