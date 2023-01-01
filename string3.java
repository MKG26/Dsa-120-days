import java.util.*;
import java.util.Scanner;

public class string3 {


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Email");

        String a = sc.next();

        String result = "";

        for(int i=0;i<a.length();i++){

            if(a.charAt(i)=='@'){
                break;
            }
            else{
                result += a.charAt(i);
            }

        }

        System.out.println();
        
        System.out.println("Username is");

        System.out.println(result);
    
    }

    
    
    
}
