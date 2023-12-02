public class l48b {
    
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

        for(int i=0; i<matrix.length-1; i++){

            for(int j=i+1; j<matrix[0].length; j++){

                swap(matrix, i,j,j,i);
                
            }
        }
    }

    static void swap(int[][] matrix, int r1, int c1, int r2, int c2 ){

        int temp = matrix[r1][c1];
        matrix[r1][c1] = matrix[r2][c2];
        matrix[r2][c2] = temp;

    }
}
