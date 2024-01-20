public class l36c {

    public static void main(String[] args) {


    }



    static boolean isSafe(int[][] board, int row, int col, int num){

        for(int i=0; i< board.length; i++){

           if(board[row][i] == num ){
               return false;
           }
        }

        for(int i=0; i< board.length; i++){

            if(board[i][col] == num){
                return false;
            }
        }

        int sqrt = (int)Math.sqrt(board.length);

        int rowStart = row - row%sqrt;
        int colStart = col - col%sqrt;


        for(int i=rowStart ; i< rowStart + sqrt; i++){

            for(int j=colStart ; j< colStart + sqrt ; j++){

                if(board[i][j] == num){
                    return false;
                }
            }
        }

        return true;
    }
}
