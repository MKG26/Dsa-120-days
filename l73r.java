import java.util.Arrays;

public class l73r {

    public static void main(String[] args) {

        int arr[][] = {

            
            {0,1,3,0},
            {3,7,9,5},
            {4,6,3,7},
            {2,4,8,4}

        };



        setMatrixZeros(arr);

    }

    



    static void setMatrixZeros(int matrix[][]){

        int[][] nums = new int[4][4];

        for(int i =0;i < matrix.length; i++){

            for(int j=0; j< matrix[0].length; j++){

                
                nums[i][j] = matrix[i][j];
        }
    }


        for(int i=0; i< matrix.length; i++){

            for(int j=0;  j< matrix[0].length; j++){
                
                if(matrix[i][j] == 0){

                    nums[i][j] = 0;

                    if(i == 0){

                        for(int k=0; k < matrix.length ; k++){

                            nums[k][j] = 0;
                        }
                    }
                    else{

                        for(int k=i; k < matrix.length ; k++){

                            nums[k][j] = 0;
                        }

                        int k = i;

                        while(k >= 0){

                            nums[k--][j] = 0;
                        }
                    }


                    if(j == 0){
                        for(int k=0; k < matrix[0].length ; k++){

                            nums[i][j] = 0;
                        }

                    }
                    else{

                        for(int k=j; k < matrix[0].length ; k++){

                            nums[i][k] = 0;
                        }

                        int k = j;

                        while(k >= 0){

                            nums[i][k--] = 0;
                        }
                    }
                }

            }
    }



    int i =0;
    int j = 0;

    for(int[] x : nums){

        for( int y : x){

            matrix[i][j++] = y;
        }

        j =0 ;
        i++;
        
    }

}

    }