
import java.util.*;
import java.util.Scanner;


public class modifiedDublicates {

    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);

        String s = sc.next();


        char stack[]= new char[s.length()];
        int i=0;

        for(int j=0 ; j<s.length(); j++){
            char current = s.charAt(j);

            if(i>0 && stack[i-1]==current){
                i--;
            }
            else
            {
                stack[i]=current;
                i++;
            }
        }


        String p = new String(stack,0,i);

        System.out.println(p);

      

 



    
    }
    
}
