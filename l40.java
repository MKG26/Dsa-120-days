import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class l40 {

    public static void main(String[] args) {

        System.out.println(combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {


        List<List<Integer>> ans = new ArrayList<>();


        findCombination(0, target,candidates, ans, new ArrayList<>());

        return ans;

    }

    static void findCombination(int ind, int target,int[] arr, List<List<Integer>> ans, List<Integer> ds){

        Arrays.sort(arr);

        if(target == 0){

            ans.add(new ArrayList<>(ds));

            return;
        }


        for(int i = ind ; i < arr.length; i++){

            if(i>ind && arr[i] == arr[i-1]){
                continue;
            }

            if(arr[i] > target){
                break;
            }

            ds.add(arr[i]);
            findCombination(i+1, target - arr[i], arr, ans, ds);
            ds.remove(ds.size()-1);
        }

    }
}
