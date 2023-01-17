import java.util.*;

public class insertionSorting {
    public static void main(String args[]){

        int arr[] = {6,8,4,2,5,10,1};

            int temp ;
            
            for(int i=1; i<7 ; i++ ){
                temp = arr[i];
                int j=i-1;

                for(; j>=0;j--){

                    if(arr[j]>temp){

                        arr[j+1] = arr[j];
                    }else{
                        break; 
                    }
                }
                arr[j+1]= temp;
            }

            for(int i=0 ; i<7 ; i++){
                System.out.print(arr[i]+" ");
            }
}
    
}
