import java.util.*;
import java.util.Scanner;


public class stringbuilder2 {

        public static void main(String args[]){

            Scanner sc = new Scanner (System.in);

            StringBuilder input = new StringBuilder(sc.next());

            for(int i=0;i<input.length();i++){
                if(input.charAt(i) == 'e'){
                    input.setCharAt(i,'i');
                }
            }

            System.out.println(input);


        
        }
}
