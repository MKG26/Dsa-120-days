import java.util.*;
import java.util.Scanner;

public class squareRoot {
    
    public static int root(int arr[], int s , int e ,int n){


    
        
        int ans = -1;
        int mid = (s+e)/2;
        
        while(s<=e){
            int sq=arr[mid]*arr[mid];
           
            if(sq > n){
                e= mid -1;
            }
            else if(sq < n){
                ans = mid;
                s = mid +1;

            }
            
            else if(sq == n){
                ans = mid;
                break;
            }

            mid = (s+e)/2;
            
        }

        return ans;
    }
    
    
    
    
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        

        int n = sc.nextInt();

        int arr[] = new int [n+1];

        for (int i=0; i<= n; i++){
            arr[i]=i;
        }

        
        

        int p = root(arr, 0 , n, n );
        
        System.out.println(p);

    }
    
}
