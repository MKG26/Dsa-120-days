import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class l15c {

    public static void main(String[] args) {

        int[] arr = {-1,0,1,2,-1,-4};


        System.out.println(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> st = new ArrayList<>();

        for(int i=0; i<nums.length; i++){

            if(i>0 && nums[i] == nums[i-1]) continue;

            int j= i+1;
            int k = nums.length -1;

            while(j<k){

                int sum = nums[i] + nums[j] + nums[k];

                if(sum < 0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{

                    st.add(Arrays.asList(nums[i], nums[j] , nums[k]));
                    j++;
                    k--;

                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k+1]) k--;

                }
            }
        }


        return st;
    }
}
