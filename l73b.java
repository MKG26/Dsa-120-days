public class l73b {
    
    public static void main(String args[]){
    
        int[][] arr = {
            {0,1,2,0},
            {3,4,5,2},
            {1,3,1,5}
        };
    

        setZeroes(arr);

        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr[0].length; j++){

                System.out.print(arr[i][j]);
            }

            System.out.println();
        }
    }

    static void setZeroes(int[][] matrix){


        int[] rowx = new int[matrix.length];
        int[] colx = new int[matrix[0].length];


        for(int i=0; i<matrix.length; i++){

            for(int j=0; j<matrix[0].length; j++){

                if(matrix[i][j] == 0){

                    rowx[i] = -1;
                    colx[j] = -1;

                }
            }
        }

        save(rowx, colx, matrix);

    }


    static void save(int[] row, int[] col, int[][] matrix){

        for(int i=0; i<row.length; i++){

            if(row[i] == -1){

                for(int j=0; j<matrix[0].length; j++){

                    matrix[i][j] = 0;
                }
            }
        }


        for(int i=0; i<col.length; i++){

            if(col[i] == -1){

                for(int j=0; j<matrix.length; j++){

                    matrix[j][i] = 0;
                }

            }
        }

        


    }


}
