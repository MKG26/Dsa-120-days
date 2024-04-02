public class l493c {


    public static void main(String[] args) {

        System.out.println(reversePairs(new int[]{1,3,2,3,1}));

    }

    public static int reversePairs(int[] nums) {


        int count = mergSortInplace(nums, 0, nums.length-1);

        return count;

    }

    static int countPairs(int[] arr, int s, int mid, int e){

        int count =0;
        int j = mid+1;

        for(int i=s; i<= mid; i++ ){

            while(j<=e && arr[i] > 2 * arr[j]){

                j++;
            }

            count += (j - (mid+1));
        }

        return count;
    }

    static int mergSortInplace(int[] arr, int s, int e){

        int count = 0;

        if(s>=e){
            return count;
        }

        int mid = (s+e)/2;

        count += mergSortInplace(arr, s, mid);
        count += mergSortInplace(arr, mid+1, e);

        count += countPairs(arr, s, mid, e);

        mergeInplace(arr,s, mid, e);

        return count;

    }

    private static void mergeInplace(int[] arr, int s, int mid, int e) {

        int[] mix = new int[e-s+1];

        int i = s;
        int j = mid+1;
        int k=0;

        while(i<=mid && j<=e){

            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }

            k++;
        }

        while(i<=mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j<=e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int l=0; l<mix.length; l++){

            arr[s+l] = mix[l];
        }
    }


}
