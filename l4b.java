import java.util.ArrayList;
import java.util.List;

public class l4b {

    public static void main(String[] args) {

        int[] arr1 = {1,2};
        int[] arr2 = {3,4};

        System.out.println(findMedianSortedArrays(arr1, arr2));

    }

    static double findMedianSortedArrays(int[] nums1, int[] nums2){

        List<Integer> temp = new ArrayList<>();

        int i=0;
        int j=0;

        while(i<nums1.length && j<nums2.length){

            if(nums1[i] < nums2[j]){

                temp.add(nums1[i++]);

            }
            else{

                temp.add(nums2[j++]);
            }
        }

        while(i< nums1.length){

            temp.add(nums1[i++]);
        }

        while(j< nums2.length){

            temp.add(nums2[j++]);
        }

        if(temp.size()%2 == 0){

            return (double)(temp.get(temp.size()/2) + temp.get(temp.size()/2 -1))/2 ;
        }
        else{

            return (double) (temp.get(temp.size()/2));
        }
    }
}
