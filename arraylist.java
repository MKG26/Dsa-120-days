import java.util.*;


public class arraylist {
    public static void main(String args[]){


        int n=5;
        for (int i=n ; i>=1; i--){
            for(int j=i ; j<=n ; j++){
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
    
}