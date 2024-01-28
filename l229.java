import java.util.*;

public class l229 {

    public static void main(String[] args) {

        System.out.println(majorityElement(new int[]{1,2}));
    }

    public static List<Integer> majorityElement(int[] nums) {

        int n = nums.length;

        List<Integer> ans = new ArrayList<>();

        HashMap<Integer, Integer> num = new HashMap<>();

        for(int i=0; i< nums.length; i++){

            if(ans.size() == 0 || !ans.contains(nums[i])){
                if (num.containsKey(nums[i])) {

                    num.put(nums[i], num.get(nums[i]) + 1);

                    if (num.get(nums[i]) > n / 3) {
                        ans.add(nums[i]);
                    }
                } else {
                    num.put(nums[i], 1);
                    if (n / 3 < num.get(nums[i])) {

                        ans.add(nums[i]);
                    }
                }

                if (ans.size() == 2) {
                    break;
                }
            }
        }




        return ans;

    }
}
