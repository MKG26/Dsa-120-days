public class l48 {
    
    public static void main(String args[]){
    
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        rotate(arr);

        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr[0].length; j++){

                System.out.print(arr[i][j]);
            }

            System.out.println();
        }    
    
    }

    static void rotate(int[][] matrix){

        int row = matrix.length;
        int col = matrix[0].length;

        int[][] ans = new int[row][col];

        for(int i=0; i<row; i++){

            for(int j=0; j<col ; j++){

                ans[j][(col-1)-i] = matrix[i][j];
            }
        }


        for(int i=0; i<row; i++){

            for(int j=0; j<col; j++){

                matrix[i][j] = ans[i][j];
            }
        }
        



    }
}
