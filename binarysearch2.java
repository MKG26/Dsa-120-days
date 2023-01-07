import java.util.*;

public class binarysearch2 {
    
    public static int leftSearch( int arr[], int s , int key){

        int start = 0;
        int end = s-1;
        int ans = -1;

        int mid = (start + end)/2;
        while(start<=end){
        
            if(key == arr[mid]){

            ans = mid;

            end = mid - 1;

        }
        else if(key> arr[mid]){
            start = mid + 1;
        }
        else if(key< arr[mid]){
            end = mid - 1;

        }
        mid = (start+end)/2;
    }
    return ans;


    }

    public static int rightSearch( int arr[], int s , int key){

        int start = 0;
        int end = s-1;
        int ans = -1;

        int mid = (start + end)/2;
        while(start<=end){
        
            if(key == arr[mid]){

            ans = mid;

            start = mid + 1;

        }
        else if(key> arr[mid]){
            start = mid + 1;
        }
        else if(key< arr[mid]){
            end = mid - 1;

        }
        mid = (start+end)/2;
    }
    return ans;


    }
    
    
    
    public static void main(String args[]){


        int arr[]= {1,2 ,3 ,3 ,3 ,5};

        System.out.println(leftSearch(arr,6,3));
        System.out.println(rightSearch(arr,6,3));

    }
}
