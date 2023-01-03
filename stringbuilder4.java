import java.util.*;
import java.util.Scanner;

public class stringbuilder4 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        StringBuilder input = new StringBuilder(sc.next());

        for(int i=0;i<input.length()/2;i++){
            int front = i;

            int back = input.length()-1-i;

            char atfront = input.charAt(front);
            char atback = input.charAt(back);

            input.setCharAt(front, atback);
            input.setCharAt(back, atfront);

            
        }
        System.out.println(input);

    }
    
}
