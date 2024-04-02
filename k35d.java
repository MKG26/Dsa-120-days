public class k35d {

    public static void main(String[] args) {

        boolean[][] arr = {
                {true, true, true },
                {true, true, true },
                {true, true, true }
        };

        maze("",arr,0,0);

    }

    static void maze(String s, boolean[][] arr, int r, int c){

        if(r == arr.length - 1  && c == arr[0].length-1){

            System.out.println(s);
            return;
        }

        if(!arr[r][c]){

            return;
        }

        arr[r][c] = false;


        if(r < arr.length-1){

            maze(s+'D', arr, r+1, c);
        }

        if(c < arr[0].length-1){
            maze(s+'R', arr, r, c+1);
        }

        if(r > 0){
            maze(s+'U', arr, r-1,c);
        }

        if(c > 0){
            maze(s+'L', arr, r,c-1);
        }

        arr[r][c] = true;

    }
}
