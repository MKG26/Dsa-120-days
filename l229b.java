import java.util.ArrayList;
import java.util.List;

public class l229b {

    public static void main(String[] args) {

        System.out.println(majorityElement(new int[]{3,2,3}));

    }

    public static List<Integer> majorityElement(int[] nums) {

            int n = nums.length;

            List<Integer> ls = new ArrayList<>();

            for(int i=0 ; i< n ; i++){

                int count = 0;

                if(ls.size() == 0 || ls.get(0) != nums[i]){

                    for(int j=0; j<n; j++){

                        if(nums[i] == nums[j]){
                            count++;
                        }



                    }

                    if(count > n/3){
                        ls.add(nums[i]);
                    }
                }

                if(ls.size()== 2){
                    break;
                }


            }


            return ls;
    }
}
