import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class l90 {

    public static void main(String[] args) {

        System.out.println(subsetsWithDup(new int[]{1,2,2}));
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        findAll(new ArrayList<>(), ans, nums, 0);

        return ans;
    }

    static void findAll(List<Integer> ds,List<List<Integer>> ans,int[] arr, int ind){




        ans.add(new ArrayList<>(ds));

        for(int i=ind; i<arr.length; i++){

            if(i!=ind && arr[i] == arr[i-1]){
                continue;
            }


            ds.add(arr[i]);
            findAll(ds, ans, arr, i+1);
            ds.remove(ds.size()-1);
        }



    }
}
