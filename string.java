import java.util.*;
import java.util.Scanner;

public class string {
    
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        int size= sc.nextInt();
        
        String array[]= new String[size];

        for(int i=0;i<size;i++){

            array[i]=sc.next();
        }

        int arraylength=0;
        
        for(int i=0;i<size;i++){

            arraylength += array[i].length();
        }

        System.out.println(arraylength);

        
    }
}
