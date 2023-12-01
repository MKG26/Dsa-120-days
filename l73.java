public class l73 {
    
    public static void main(String args[]){
    
        int[][] arr = {
                        {1,1,1},
                        {1,0,1},
                        {1,1,1}
                        };

        
        
        setZeroes(arr);

        minusOneToZero(arr);

        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr[0].length; j++){

                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }   

    public static void setZeroes(int[][] matrix) {
        
        int row = matrix.length;
        int col = matrix[0].length;



        for(int i=0; i<row; i++){


            for(int j=0; j<col; j++){

                if(matrix[i][j] == 0){

                    rowZero(i,j,matrix);
                    colZero(i,j,matrix);


                    
                }
            }

              
        }
    }

    static void rowZero(int row, int col , int[][] matrix){

        for(int i=0; i<matrix[0].length; i++){

            if(matrix[row][i] >0)
                matrix[row][i] = -1;
        }


    }

        static void colZero(int row, int col , int[][] matrix){

        for(int i=0; i<matrix.length; i++){

            if(matrix[i][col] >0)
            matrix[i][col] = -1;
        }


    }

    static void minusOneToZero(int[][] matrix){

        for(int i=0; i<matrix.length; i++){

            for(int j=0; j<matrix[0].length; j++){

                if(matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    


}

