import java.util.ArrayList;
import java.util.List;

public class l229d {

    public static void main(String[] args) {

        System.out.println(majorityElement(new int[]{0,0,0}));

    }

    public static List<Integer> majorityElement(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        int n = nums.length;

        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;

        int cnt1 = 0;
        int cnt2 = 0;

        for(int i=0; i< nums.length; i++){

            if(cnt1 == 0 && nums[i] != ele2){
                ele1 = nums[i];
                cnt1++;
            }
            else if(cnt2 == 0 && nums[i] != ele1) {
                ele2 = nums[i];
                cnt2++;
            }
            else if(ele1 == nums[i]){
                cnt1++;
            }
            else if(ele2 == nums[i]){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }

         cnt1 = 0;
         cnt2 = 0;

        for(int i=0; i< nums.length; i++) {

            if(nums[i] == ele1) cnt1++;
            if(nums[i] == ele2) cnt2++;

        }

        if(cnt1 > n/3) ans.add(ele1);
        if(cnt2 > n/3) ans.add(ele2);

        return ans;
    }
}
