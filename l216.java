import java.util.ArrayList;
import java.util.List;

public class l216 {

    public static void main(String[] args) {

        System.out.println(combinationSum3(3,7));
    }

    public static List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> ans = new ArrayList<>();

        findList(k, n, 1, new ArrayList<>(), ans, 1);

        return ans;

    }

    static void findList(int k , int n , int ind, List<Integer> ds, List<List<Integer>> ans, int count){


        if(ds.size() == k || ind > 9){

            if(n == 0 && ds.size() == k) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(ind <= n){

            ds.add(ind);
            findList(k,n-ind, ind+1,ds, ans, count+1 );
            ds.remove(ds.size()-1);

        }




            findList(k, n, ind +1, ds, ans, count);






    }







}
