import java.util.*;

public class binarysearch {
    public static void main(String args[]){

        int even[] = {2,6,10,13,17,20};

        int odd[] = {5,11,15,16,29};


        binarySearch(even, 6 , 17);
    }

    public static void binarySearch(int arr[], int size , int key){

        int start = 0;

        int end = size -1 ;

        int mid = (start + end)/2;

        int value = 0;
        while(start<=end){

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

        System.out.println(value);
    }
}
