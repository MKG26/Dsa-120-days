import java.util.*;

public class l18 {

    public static void main(String[] args) {

        System.out.println(fourSum(new int[]{1,0,-1,0,-2,2}, 0));

    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {


        int n = nums.length;



        Set<List<Integer>> anss = new HashSet<>();


        for(int i=0; i< n; i++){

            for(int j=i+1; j<n; j++){

                for(int k = j+1; k< n; k++ ){

                    for(int l = k+1; l < n; l++){


                        int sum = nums[i] + nums[j] + nums[k] + nums[l];

                        if(sum == target){

                            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);

                            Collections.sort(temp);

                            anss.add(temp);
                        }
                    }
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>(anss);

        return ans;
    }
}
