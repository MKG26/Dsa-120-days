import java.util.Arrays;
import java.util.HashMap;

public class l349 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(intersection(new int[]{1,2,2,1}, new int[]{2,2})));


    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        int temp = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<nums1.length; i++){

            for(int j=0; j<nums2.length; j++){

                if(nums1[i] == nums2[j]){

                    if(hm.containsValue(nums1[i])){
                        continue;
                    }

                    hm.put(temp++,nums1[i]);

                }
            }
        }
        int[] arr = new int[hm.size()];

        for(int i=0; i< hm.size(); i++){

            arr[i] = hm.get(i);
        }


        return arr;
    }
}
