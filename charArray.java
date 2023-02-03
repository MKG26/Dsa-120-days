import java.util.*;
import java.util.Scanner;

public class charArray {
    public static void main(String args[]){
    
        int s = 5;

        char arr[] = new char[s];

        Scanner sc = new Scanner(System.in);

        for(int i=0 ; i<s ; i++){

            arr[i]= sc.next().charAt(0);
        }

        for(int i=0 ; i<s ; i++){

            System.out.print(arr[i]);
        }

    
    }
}
