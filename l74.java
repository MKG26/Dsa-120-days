public class l74 {

    public static void main(String[] args) {

        int[][] arr = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };

        System.out.println(searchMatrix(arr, 11));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        for(int i=0; i<matrix.length; i++){

            if(matrix[i][0]<= target && matrix[i][matrix[0].length-1] >= target){

                return bs(matrix, i, target);
            }

        }

        return false;

    }

    private static boolean bs(int[][] matrix, int i, int target) {

        int start = 0;

        int end = matrix[0].length-1;

        while(start<=end){

            int mid = start + (end-start)/2;

            if(matrix[i][mid] < target){

                start = mid+1;
            }
            else if(matrix[i][mid]> target){

                end = mid-1;
            }
            else {

                return true;
            }

        }

        return false;


    }
}
