import java.util.*;

public class l15b {

    public static void main(String[] args) {

        int[] arr = {-1,0,1,2,-1,-4};

        System.out.println(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> st = new HashSet<>();

        for(int i=0; i<nums.length; i++){

            Set<Integer> hashSet = new HashSet<>();

            for(int j=i+1; j<nums.length; j++){

                int third = -(nums[i]+nums[j]);

                if(hashSet.contains(third)){

                    List<Integer> temp = Arrays.asList(nums[i],nums[j] , third);

                    temp.sort(null);

                    st.add(temp);

                }
                hashSet.add(nums[j]);
            }
        }

        List<List<Integer>> ans = new ArrayList<>(st);

        return ans;
    }
}
