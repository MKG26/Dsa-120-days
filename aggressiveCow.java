import java.util.*;




public class aggressiveCow {

    public static boolean isPossible(int arr[], int k , int mid){
        
        int lastOne = arr[0];
        int cow = 1;
        for(int i=0; i<arr.length; i++){

            if(arr[i]- lastOne >= mid){
                cow ++;
                if(cow == k){
                    return true;
                }
                lastOne = arr[i];
            }
        }
        return false;

    }




    public static void main(String args[]){

        int arr[] = {1,2,3,4,6};

        int s = 0;

        int k =2;
        int maxi = -1;

        for(int i=0; i<arr.length; i++){
            maxi = Math.max(maxi , arr[i]);
        } 

        int e = maxi;

        int mid = (s+e)/2;

        int ans = -1;
        while(s<=e){
            if(isPossible(arr , k, mid)){
                ans = mid;

                s = mid +1;
            }else{
                e = mid -1;
            }
            mid = (s+e)/2;
        }

        System.out.println(ans);


    }
}
