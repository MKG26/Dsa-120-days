import java.util.Arrays;

public class l4 {

    public static void main(String[] args) {

        int[] arr1 = {3};
        int[] arr2 = {-2,-1};

        System.out.println(findMedianSortedArrays(arr1, arr2));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] temp = new int[nums1.length + nums2.length];


        for(int i=0; i<nums1.length; i++){

            temp[i] = nums1[i];
        }

        int j=0;

        for(int i=nums1.length; i<nums1.length+nums2.length ; i++){

            temp[i] = nums2[j++];
        }

        Arrays.sort(temp);

        if(temp.length % 2 == 0){

            int start = 0;
            int end = temp.length-1;

            while(start<end){

                start++;
                end--;
            }

            return (double)(temp[end] + temp[start])/2;

        }
        else{

            int start = 0;
            int end = temp.length-1;

            while(start<end){

                start++;
                end--;
            }

            return (double)temp[start];

        }


    }
}
