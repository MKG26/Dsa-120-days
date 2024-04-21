public class l200 {

    public static void main(String[] args) {

        char[][] arr = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };

        System.out.println(numIslands(arr));

    }

    public static int numIslands(char[][] grid) {

        int count = 0;

        for(int i=0; i< grid.length; i++){

            for(int j=0; j<grid[0].length; j++){

                if(grid[i][j] == '1'){

                  count += 1;

                  callBFS(grid, i, j);

                }

            }
        }

        return count;

    }


    public static void callBFS(char[][] arr, int i, int j){

        if(i< 0 || i>= arr.length || j<0 || j>= arr[0].length || arr[i][j] == '0'){
            return;
        }

        arr[i][j] = '0';

        callBFS(arr, i-1, j);
        callBFS(arr, i+1, j);
        callBFS(arr, i, j-1);
        callBFS(arr, i, j+1);

    }
}
