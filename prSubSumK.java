import java.util.ArrayList;
import java.util.List;

public class prSubSumK {

    public static void main(String args[]){
    
        int[] arr = {1,2,1};
    
        List<Integer> ds = new ArrayList<>();

        int n = arr.length;

        int index = 0;

        int k = 2;

        int sum = 0 ;
        print(index, n, ds, arr ,sum, k);

    }
    

    static boolean print(int index , int n, List<Integer> ds, int[] arr , int sum, int k){

        

        if(index == n ){

            if(sum == k){
                System.out.println(ds);
                return true;
            }

            return false;
        }


        ds.add(arr[index]);

        sum += arr[index];

        if(print(index+1, n, ds, arr, sum, k) == true){
            return true;
        }

        ds.remove(ds.size() - 1);

        sum -= arr[index];

        if(print(index + 1, n, ds, arr, sum, k) == true){
            return true;
        }

        return false;
    }
}
