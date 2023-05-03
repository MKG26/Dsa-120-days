import java.util.*;

public class pivot2 {
    
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

    public static int binarySearch(int arr[], int start, int end , int key){

        int mid = (start + end)/2;

        int value = 0;
        while(start<=end){
3);	printf("After sorting the elem")
            if(arr[mid] == key){

                value = mid;
                
            }

            if(key < arr[mid]){

                end = mid -1;
            }
            else{

                start = mid +1;
            }

            mid = (start + end)/2;
        }

        
        return value;
    }


    
    
    
    public static void main(String args[]){

        int arr[] = {7,8,1,2,3};
        int s = 5;
        
        int pivot = element(arr , 5);

        int key = 1;
        int ans = 0;
        if(arr[pivot]<=key && key <= arr[s-1]){

             ans = binarySearch(arr, pivot , s-1 , key);
        }
        else{
            ans = binarySearch(arr , 0  , pivot-1 , key);
        }
        
        System.out.println(ans);

    }
    
}


