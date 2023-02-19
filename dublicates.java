import java.util.*;
import java.util.Scanner;


public class dublicates {

    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);

        String s = sc.next();





        String sub = new String();

        for(int i=0; i<s.length(); i++){
            
           

            for(int j=0; j<s.length()-1; j++){

                char temp1 = s.charAt(j);
                char temp2 = s.charAt(j+1);
                
                if(temp1 == temp2){
                    sub = s.substring(0,j)+s.substring(j+2,s.length());
                    s=sub;
                    j--;
                    
            }
        }

            


        }


        System.out.println(s);

    
    }
    
}
