import java.util.Arrays;

public class contest1 {

    public static void main(String[] args) {

        int[] arr1 = {4,3,2,3,1};
        int[] arr2 = {2,2,5,2,3,6};

        System.out.println(Arrays.toString(findIntersectionValues(arr1,arr2)));
    }

    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {


        int ans1 = common1(nums1,nums2);

        int ans2 = common2(nums2, nums1);

        return new int[]{ans1,ans2};

    }

    private static int common2(int[] nums2, int[] nums1) {
        int count =0;

        for(int i=0; i<nums2.length; i++){

            for(int j=0; j<nums1.length; j++){

                if(nums2[i] == nums1[j]){

                    count++;
                    break;

                }
            }
        }


        return count;
    }

    private static int common1(int[] nums1, int[] nums2) {

        int ans =0;

        for(int i=0; i<nums1.length; i++){

            for(int j=0; j<nums2.length; j++){

                if(nums1[i] == nums2[j]){

                    ans++;
                    break;

                }
            }
        }


        return ans;
    }

}
