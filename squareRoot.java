import java.util.*;
import java.util.Scanner;

public class squareRoot {
    
    public static int root(double arr[], int s , int e ,int n){


    
        
        int ans = -1;
        int mid = (s+e)/2;
        
        while(s<=e){
            double sq=arr[mid]*arr[mid];
           
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

    public static double incre(double arr[],int ans , int n){

        double result = -1;
        for(double i=0.1; i<1; i=i+0.1 ){

            arr[ans]+=i;

            double sq = arr[ans]*arr[ans];


            if(sq<=n){

                result = arr[ans];
                
            }
            arr[ans] = arr[ans]-i;
        }
        return result;
    }
    
    
    
    
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        

        int n = sc.nextInt();

        double arr[] = new double [n+1];

        for (int i=0; i<= n; i++){
            arr[i]=i;
        }

        
        

        int p = root(arr, 0 , n, n );

        double r = incre(arr, p , n);

        System.out.println(r);
        


    }
    
}
