public class l73 {
    
    public static void main(String args[]){
    
        int[][] arr = {
                        {1,1,1},
                        {1,0,1},
                        {1,1,1}
                        };

        
        
        setZeroes(arr);

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

            boolean test = true;
            for(int j=0; j<col; j++){

                if(matrix[i][j] == 0){

                    rowZero(i,j,matrix);
                    colZero(i,j,matrix);
                    test = false;
                    break;
                    
                }
            }

                if(!test){
                    break;
                }
        }
    }

    static void rowZero(int row, int col , int[][] matrix){

        for(int i=0; i<matrix[0].length; i++){

            matrix[row][i] = 0;
        }


    }

        static void colZero(int row, int col , int[][] matrix){

        for(int i=0; i<matrix.length; i++){

            matrix[i][col] = 0;
        }


    }
    


}

