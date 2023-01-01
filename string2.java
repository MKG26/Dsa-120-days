import java.util.*;
import java.util.Scanner;

public class string2 {
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the string");

        String a = sc.next();

        String result="";
        
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='e'){
                result += 'i';
            }
            else
            {
                result += a.charAt(i);
            }


        }

        System.out.println(result);
    }    
}
