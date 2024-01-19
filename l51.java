import java.util.ArrayList;
import java.util.List;

public class l51 {

    public static void main(String[] args) {


        System.out.println(solveNQueens(4));
    }

    public static List<List<String>> solveNQueens(int n) {



        List<List<String>> ans = new ArrayList<>();

        queeens(ans, n, 0, new ArrayList<>());


        return ans;


    }

    static void queeens(List<List<String>> ans, int n, int row, List<String> ds){


        boolean[][] board = new boolean[n][n];

        nQueen(n, ans , 0, board);

    }

    static void nQueen(int n, List<List<String>> ans , int row, boolean[][] board){


        if(row == n){

            ans.add(putIn(board));
            return;

        }



        for(int col=0; col< n; col++){

            if(isSafe(board, row, col)){


                board[row][col] = true;

                nQueen(n, ans, row+1, board);

                board[row][col] = false;


            }

        }

    }

    static List<String> putIn(boolean[][] board){

        List<String> ret = new ArrayList<>();

        StringBuilder app = new StringBuilder();

        for(boolean[] i : board){

            for(boolean j : i){

                if(j){

                    app.append('Q');

                }
                else{
                    app.append('.');
                }
            }

            ret.add(app.toString());

            app.delete(0,app.length());
        }


        return ret;

    }


    static boolean isSafe(boolean[][] board, int row, int col){


        for(int i=0; i<row ; i++){

            if(board[i][col]){
                return false;
            }
        }

        int maxLeft = Math.min(row,col);

        for(int i = 1; i <= maxLeft ; i++){

            if(board[row-i][col -i]){
                return false;
            }

        }

        int maxRight = Math.min(row, board.length-col -1);

        for(int i=1; i<= maxRight ; i++ ){

            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }
}
