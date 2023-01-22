import java.util.*;

public class mergeSort {
    public static void main(String args[]){
    
        int arr1[] = {1,3,5,7,8,9};

        int arr2[] = {2,4,6};

        int arr3[] = new int[9];


        sort(arr1,6,arr2,3,arr3);


    
    }


        public static void sort(int arr1[],int n,int arr2[],int m,int arr3[]){

            int i=0;
            int j=0;
            int k=0;

            while(i<n && j<m){
                
                if(arr1[i]<arr2[j]){
                    arr3[k] = arr1[i];
                    k++;
                    i++;
                }else{
                    arr3[k]= arr2[j];
                    k++;
                    j++;
                }
            }

            while(i<6){
                arr3[k] = arr1[i];
                k++;
                i++;
            }

            while(j<3){
                arr3[k]=arr2[j];
                k++;
                j++;
            }

            for(int h=0 ; h<arr3.length ; h++){
                System.out.print(arr3[h]+ " ");
            }
            

        } 
}
