import java.util.ArrayList;
import java.util.List;

public class recurSubse {
    public static void main(String args[]){
    
        int[] arr = {3,1,2};


        List<Integer> ds = new ArrayList<>();

        int n = arr.length;

        int index = 0;

        print(index, n, ds, arr);
    
    }

    static void print(int index, int n, List<Integer> ds, int[] arr){

        if(index == n){

            System.out.println(ds);
            return;
        }

        ds.add(arr[index]);

        print(index+1, n, ds, arr);

        ds.remove(ds.size() -1);

        print(index+1, n, ds, arr);
    }
}
