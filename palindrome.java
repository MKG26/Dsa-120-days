import java.util.Scanner;

public class palindrome {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int a_pointer = 0;
        int b_pointer = s.length()-1;

        while(a_pointer<=b_pointer){

            if(s.charAt(a_pointer) != s.charAt(b_pointer)){
                System.out.println("No");

                return;
            }

            a_pointer++;
            b_pointer--;
        }

        System.out.println("Yes");


    }
}
