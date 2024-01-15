import java.util.Arrays;

public class k35f {

    public static void main(String[] args) {

        boolean[][] arr = {
                {true, true, true },
                {true, true, true },
                {true, true, true }
        };

        int[][] path = new int[arr.length][arr[0].length];

        maze("",arr,0,0,path, 0);

    }

    static void maze(String s, boolean[][] arr, int r, int c, int[][] path, int step){

        if(r == arr.length - 1  && c == arr[0].length-1){

            path[r][c] = step;

            for(int[] a : path){
                System.out.println(Arrays.toString(a));
            }


            System.out.println(s);

            System.out.println();
            return;
        }

        if(!arr[r][c]){

            return;
        }

        arr[r][c] = false;

        path[r][c] = step;


        if(r < arr.length-1){

            maze(s+'D', arr, r+1, c, path, step+1);
        }

        if(c < arr[0].length-1){
            maze(s+'R', arr, r, c+1, path , step+1);
        }

        if(r > 0){
            maze(s+'U', arr, r-1,c, path, step+1);
        }

        if(c > 0){
            maze(s+'L', arr, r,c-1, path, step+1);
        }

        arr[r][c] = true;
        path[r][c] = 0;

    }
}