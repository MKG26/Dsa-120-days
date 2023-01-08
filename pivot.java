import java.util.*;

public class pivot {
    
    public static int element(int arr[], int size){
        int s = 0;
        int e = size-1;

        int mid = s + (e-s)/2;

        while(s<e){
        if(arr[mid]>=arr[0]){
            s = mid + 1;
        }
        else{
            e = mid;
        }
        mid = s + (e-s)/2;
    }
    return s;
    }
    
    
    
    public static void main(String args[]){

        int arr[] = {7,8,1,2,3};
        
        int ans = element(arr , 5);

        System.out.println(ans);

    }
    
}
