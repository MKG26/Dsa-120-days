import java.util.*;
import java.util.Scanner;

public class stringbuilder3 {
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);

        StringBuilder input = new StringBuilder(sc.next());

        for(int i=0;i<input.length();i++){
            if(input.charAt(i) == '@'){
              input.delete(i,input.length());  
            }
        }

        System.out.println(input);




    }

}
