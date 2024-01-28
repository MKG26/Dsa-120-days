import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class l229c {


    public static void main(String[] args) {

        System.out.println(majorityElement(new int[]{3,2,3}));
    }

    public static List<Integer> majorityElement(int[] nums) {


        int n = nums.length;

        int mini = (int)n/3 + 1;

        HashMap<Integer,Integer> hm = new HashMap<>();

        List<Integer> ans = new ArrayList<>();

        for(int i=0; i< n ; i++){

            int value = hm.getOrDefault(nums[i] , 0);

            hm.put(nums[i] , value+1);

            if(hm.get(nums[i]) == mini){
                ans.add(nums[i]);
            }

            if(ans.size() == 2) break;
        }

        return ans;

    }

}
