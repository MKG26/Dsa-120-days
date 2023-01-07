import java.util.*;

public class recursion3 {
    
    public static int calcPower(int x, int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }

        int twoPow1 = calcPower(x , n-1);

        int twoPow = x * twoPow1;

        return twoPow;

    }
    
    
    
    
    public static void main(String args[]){


        int ans  = calcPower(2, 5);

        System.out.println(ans);


    }
}
