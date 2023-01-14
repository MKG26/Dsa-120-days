import java.util.*;

public class bubbleSorting {
    public  static void main(String args[]){

        int arr[]= {10, 6 ,8 , 4 ,14, 60};

        int minIndex = 0;
        for(int i=0 ; i<arr.length-1 ; i++){

            for(int j=0 ; j<arr.length-1 ; j++ ){
                int swap;
                if(arr[j]> arr[j+1]){
                    minIndex = j+1;
                

                swap = arr[minIndex];
                arr[minIndex]= arr[j];
                arr[j]= swap;
                }


            }

        }
            for(int i=0; i<6 ; i++){
                System.out.print(arr[i] + " ");
            }
    }
}
