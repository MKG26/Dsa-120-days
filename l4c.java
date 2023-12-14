public class l4c {

    public static void main(String[] args) {

        int[] arr1 = {1,2};
        int[] arr2 = {3};

        System.out.println(findMedianSortedArrays(arr1, arr2));

    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;

        int n = n1+n2;

        int ind2 = n/2;
        int ind1 = ind2 - 1;

        int cnt = 0;

        int indel1 = -1;

        int indel2 = -1;

        int i=0;
        int j=0;

        while(i<n1 && j<n2){

            if(nums1[i] < nums2[j]){

                if(cnt == ind1){
                    indel1 = nums1[i];
                }
                else if(cnt == ind2){
                    indel2 = nums1[i];
                }

                i++;
                cnt++;
            }
            else{

                if(cnt == ind1){
                    indel1 = nums2[j];
                }
                else if(cnt == ind2){
                    indel2 = nums2[j];
                }

                j++;
                cnt++;
            }
        }

        while(i<n1){

            if(cnt == ind1){
                indel1 = nums1[i];
            }
            else if(cnt == ind2){
                indel2 = nums1[i];
            }

            i++;
            cnt++;
        }

        while(j<n2){
            if(cnt == ind1){
                indel1 = nums2[j];
            }
            else if(cnt == ind2){
                indel2 = nums2[j];
            }

            j++;
            cnt++;
        }

        if(n%2 == 1){

            return (double)indel2;
        }
        else {

            return (double)(indel2+indel1)/2;
        }

    }
}
