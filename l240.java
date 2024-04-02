public class l240 {

    public static void main(String[] args) {


        int[][] arr = {
                {5}
        };


        System.out.println(searchMatrix(arr, 32));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {


        int r = 0;
        int c = matrix[0].length-1;

        while(r < matrix.length && c >= 0){

            if(target < matrix[r][c]){
                c--;
            }
            else if(target > matrix[r][c]){
                r++;
            }
            else{
                return true;
            }
        }

        return false;
    }
}
