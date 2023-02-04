import java.util.*;
import java.util.Scanner;


public class palindromeset {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        String b = new StringBuilder(a).reverse().toString();

        if(a.equals(b)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
        
    
    }    
}
