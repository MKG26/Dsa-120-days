import java.util.*;

public class selectionSorting{
 public static void main(String args[]){

    int arr[] = {7,8,6,5,4};

    int minIndex ;

    for(int i=0 ; i<(arr.length)-1;i++){
        minIndex = i;
        int swap;
        for(int j=i+1 ; j<arr.length; j++){
            if(arr[j]< arr[minIndex]){
                minIndex =j;

            swap = arr[i];
            arr[i]= arr[minIndex];
            arr[minIndex]= swap;
            }

        }
        
    }

    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+ " ");
    }
    }

}
