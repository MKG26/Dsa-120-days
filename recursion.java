import java.util.*;

public class recursion {
    
    public static int printFact(int n){

        if(n==1 || n==0){
            return 1;
        }

        int sum = printFact(n-1);

        int nextSum = n * sum;

        return nextSum;

    }
    
    
    
    public static void main(String args[]){
        int n=5;

        int result = printFact(n);

        System.out.println(result);

    }
    
}
