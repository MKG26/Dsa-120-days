public class l37 {

    public static void main(String[] args) {

        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        solveSudoku(board);

    }

    public static void solveSudoku(char[][] board) {

        if(solve(board)){

            display(board);
        }
        else{
            System.out.println("....");
        }



    }

    static boolean solve(char[][] board){

        int n = board.length;

        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        for(int i=0; i< n ; i++){

            for(int j=0; j< n; j++){

                if(board[i][j] == '.'){

                    row = i;
                    col = j;

                    emptyLeft = false;
                    break;


                }
            }

            if(emptyLeft == false){
                break;
            }
        }

        if(emptyLeft == true){
            return true;
        }

        for(int number =1; number <=9 ; number++){

            if(isSafe(board, row, col , number)){

                board[row][col] = (char)(number + '0');

                if(solve(board)){

                    return true;
                }
                else{
                    board[row][col] = '.';
                }
            }
        }

        return false;
    }

    static boolean isSafe(char[][] board, int row, int col, int num){

        for(int i=0; i< board.length; i++){

            if(board[row][i] == (char)(num + '0') ){
                return false;
            }
        }

        for(int i=0; i< board.length; i++){

            if(board[i][col] == (char)(num+'0')){
                return false;
            }
        }

        int sqrt = (int)Math.sqrt(board.length);

        int rowStart = row - row%sqrt;
        int colStart = col - col%sqrt;


        for(int i=rowStart ; i< rowStart + sqrt; i++){

            for(int j=colStart ; j< colStart + sqrt ; j++){

                if(board[i][j] == (char)(num+'0')){
                    return false;
                }
            }
        }

        return true;
    }



    static void display(char[][] board){

        for(char row[] : board){

            for(char number : row){

                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}

