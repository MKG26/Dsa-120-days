import java.util.ArrayList;

public class k35e {

    public static void main(String[] args) {

        int[][] arr = {
                {1,1,1},
                {1,1,1},
                {1,1,1}
        };

        System.out.println(findSum(arr,3));

    }




    public static ArrayList< String > findSum(int[][] arr, int n) {

        ArrayList<String> al = new ArrayList<>();

        path("", arr, 0, 0, n, al);

        return al;

    }

    static void path(String s, int[][] arr, int r, int c, int n, ArrayList<String> al){

        if(r == n-1 && c == n-1){

            al.add(s);
            return;
        }

        if(arr[r][c] == 0){
            return;
        }

        arr[r][c] = 0;

        if(r < n-1){
            path(s+'D', arr, r+1, c, n, al);
        }

        if(c < n-1){
            path(s+'R', arr, r, c+1, n, al);
        }

        if(r > 0){
            path(s+'U', arr, r-1, c, n, al);
        }

        if(c > 0){
            path(s+'L', arr, r, c-1, n, al);
        }

        arr[r][c] = 1;

    }
}
