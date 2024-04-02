import java.util.*;

public class l15 {

    public static void main(String[] args) {


        int[] arr = {-1,0,1,2,-1,-4};

        System.out.println(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;

        Set<List<Integer>> st = new HashSet<>();

        for(int i=0; i<n ; i++){

            for(int j=i+1 ; j<n; j++){

                for(int k=j+1 ; k<n ; k++){


                    if(nums[i] + nums[j] + nums[k] == 0){

                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);

                        temp.sort(null);

                        st.add(temp);
                    }
                }
            }
        }

            List<List<Integer>> ans = new ArrayList<>(st);

            return ans;

    }
}
