import java.util.Arrays;

public class k30b {

    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};

        mergSortInplace(arr, 0 , arr.length-1);

        System.out.println(Arrays.toString(arr));

    }


    static void mergSortInplace(int[] arr, int s, int e){


        if(s>= e){
            return;
        }
        
        int mid = (s+e)/2;
        
        mergSortInplace(arr, s, mid);
        mergSortInplace(arr, mid+1, e);
        
        mergeInplace(arr,s, mid, e);
        
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
