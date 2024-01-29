import java.util.*;

public class l18b {

    public static void main(String[] args) {

        System.out.println(fourSum(new int[]{1,0,-1,0,-2,2}, 0));

    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {

        int n = nums.length;

        Set<List<Integer>> sett = new HashSet<>();

        for(int i=0; i< n; i++){
            for(int j=i+1; j< n; j++){

                HashSet<Integer> hs = new HashSet<>();
                for(int k=j+1; k< n; k++){

                    int sum = nums[i] + nums[j] + nums[k];

                    int fourth = target - sum ;

                    if(hs.contains(fourth)){

                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], fourth);

                        Collections.sort(temp);

                        sett.add(temp);
                    }

                     hs.add(nums[k]);

                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>(sett);

        return ans;
    }
}
