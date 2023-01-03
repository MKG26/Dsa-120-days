import java.util.*;
import java.util.Scanner;

public class stringbuilder {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        
        String array[] = new String[size];
        
        
        StringBuilder input = new StringBuilder("");

        for(int i=0;i<size;i++){
            array[i]= sc.next();
        }

        for(int i=0;i<size;i++){
            input.append(array[i]);
        }        

        System.out.println(input);


    }
}
