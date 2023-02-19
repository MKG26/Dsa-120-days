import java.util.*;
import java.util.Scanner;


public class dublicates {

    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);

        String s = sc.next();


        String s2 = new String();


        String sub = new String();

        for(int i=0; i<s.length()-1; i++){
            
            char temp1 = s.charAt(i);

            char temp2 = s.charAt(i+1);

            
            if(temp1 == temp2){
                    sub = s.substring(0,i)+s.substring(i+2,s.length());

            }

            
            s=sub;

        }


        System.out.println(sub);

    
    }
    
}
