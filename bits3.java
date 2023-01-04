import java.util.*;
import java.util.Scanner;
public class bits3 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);

        int oper = sc.nextInt(); 
        
        int i = 5;

        int pos = 1;

        int bitMask = 1<<pos;

        if(oper ==1){

            int v = bitMask | i;

            System.out.println(v);
        }
        else{
            int newBitMask = ~bitMask;

            int h = newBitMask & i;
            System.out.println(h);
        }


           
           
    }
}
