import java.util.HashSet;

public class l2540a {

    public static void main(String[] args) {


        System.out.println(getCommon(new int[]{1,2,3}, new int[]{2,4}));
    }

    public static int getCommon(int[] nums1, int[] nums2) {

        int ans = -1;

        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i< nums1.length ; i++){

            hs.add(nums1[i]);
        }

        for(int i=0; i< nums2.length; i++){

            if(hs.contains(nums2[i])){
                ans = nums2[i];
                break;
            }
        }

        return ans;
    }
}

