import java.util.*;

public class bookAllocation {

    public static boolean isPossible(int arr[], int n , int m, int mid){

        int student =1;
        int possSum= 0;
        for(int i =0; i<n ; i++){
            if(possSum+arr[i] <= mid){
                possSum += arr[i];
            }
            else{
                student++;
                if(student > m || arr[i] > mid){
                    return false;
                }
                possSum = arr[i];

            }
        }
        return true;

    }
    
    public static void main(String args[]){

        int arr[]= {10, 20, 30 ,40};

        int n= 4;

        int m= 2;

        int sum = 0;

        for(int i = 0; i<n; i++){
            sum +=arr[i];
        }

        int s=0 , e= sum;

        int mid = (s+e)/2;

        int ans =0 ;

        while(s<=e){

            if(isPossible(arr, n , m , mid)){
                ans = mid;

                e= mid -1;
            }
            else{
                s = mid +1;
            }

            mid = (s+e)/2;
        }

        System.out.println(ans);
    }
}
