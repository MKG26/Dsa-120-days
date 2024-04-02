public class l2540 {

    public static void main(String[] args) {


        System.out.println(getCommon(new int[]{1,2,3}, new int[]{2,4}));
    }

    public static int getCommon(int[] nums1, int[] nums2) {

        int ans = -1;
        boolean temp = false;

        for(int i=0; i< nums1.length; i++){

            for(int j=0; j< nums2.length ; j++){

                if(nums1[i] == nums2[j]){
                    ans = nums1[i];
                    temp = true;
                    break;
                }

            }
            if(temp){
                break;
            }
        }

        return ans;
    }
}
