import java.util.*;
import java.util.Scanner;
import java.time.Clock;


public class class2 {
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);
        
        int m= sc.nextInt();
        int n= m;
            int A[] = new int[n];

            for(int h=0 ; h<m; h++){
                A[h]= sc.nextInt();
            }

            Clock clock = Clock.systemUTC();




            int j;
            int i;
    
            
        for(i=0 ; i<n-1; i++){
            
            for(j=0; j<n-1-i ; j++){
    
                if(A[j]> A[j+1]){
                    int t=A[j];
                    A[j]= A[j+1];
                    A[j+1]= t;
                }               

    

    
               
    
    }
}

System.out.println("t1 " + clock.instant());

for(int h=0 ; h<m; h++){
    System.out.print(A[h]+" ");
}



    }

    
    }

