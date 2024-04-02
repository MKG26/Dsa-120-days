import java.util.ArrayList;
import java.util.List;

public class l79 {


    public static void main(String[] args) {

        char[][] board = {
                {'A','B','C','E'},
                {'S', 'F', 'C', 'S'},
                {'A','D','E','E'}
        };


        System.out.println(exist(board, "ABCCED"));
    }

    public static boolean exist(char[][] board, String word) {

        boolean visited[][] = new boolean[board.length][board[0].length];

        for(int i=0; i< board.length; i++){

            for(int j=0; j< board[0].length; j++){

                if(board[i][j] == word.charAt(0) && search(i, j,0, board, visited , word)){
                    return true;
                }
            }
        }

        return false;


    }

    static boolean search( int i, int j,int index, char[][] board, boolean[][] visited, String word){

        if(index == word.length()){
            return true;
        }

        if(i<0 || i>= board.length || j<0 || j>=board[0].length || board[i][j] != word.charAt(index) || visited[i][j] == true){

            return false;
        }


        visited[i][j] = true;




        if(     search(i+1, j,index+1, board, visited, word) ||
                search(i-1, j,index+1, board, visited, word) ||
                search(i, j+1,index+1, board, visited, word) ||
                search(i, j-1, index+1, board, visited, word)

        ){
            return true;
        }

        visited[i][j] =false;

        return false;





    }
}
