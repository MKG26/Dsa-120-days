public class l74b {

    public static void main(String[] args) {


        int[][] arr = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };

        System.out.println(searchMatrix(arr, 11));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length;
        int col = matrix[0].length;


        int start = 0;
        int end = matrix.length * matrix[0].length -1;

        while(start<=end){

            int mid = start + (end-start)/2;

            int element = matrix[mid/col][mid%col];

            if(element < target){

                start = mid +1;
            }
            else if (element > target){
                end = mid-1;
            }
            else{
                return true;
            }

        }

        return false;
    }
}
