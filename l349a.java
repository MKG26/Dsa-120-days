import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class l349a {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(intersection(new int[]{1,2,2,1}, new int[]{2,2})));


    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();


        for(int i=0; i<nums1.length; i++){

            hs.add(nums1[i]);
        }

        for(int i=0; i<nums2.length; i++){

            if(hs.contains(nums2[i])){
                al.add(nums2[i]);
                hs.remove(nums2[i]);
            }
        }


        int[] arr = new int[al.size()];

        for(int i=0; i<al.size(); i++){
            arr[i] = al.get(i);
        }

        return arr;
    }
}
