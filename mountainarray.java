import java.util.*;

public class mountainarray {
    
    public static int peak(int arr[], int s ){

        int start = 0;

        int end = s -1;

        int mid = (start+end)/2;

        while (start<end){
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }
            else{
                end = mid;
            }
            mid = (start+end)/2;
        }
        return start;
    }
    
    
    public static void main(String args[]){

        int arr[]={3 , 4 ,5 ,2,1};

        int ans = peak(arr , 5);

        System.out.println(ans);
    }
}
