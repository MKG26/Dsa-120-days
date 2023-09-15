import java.util.ArrayList;
import java.util.Scanner;


public class arrayyList {
    
    public static void main(String args[]){
    
        ArrayList<Integer> al = new ArrayList<>(10);

            Scanner sc = new Scanner(System.in);

            for(int i=0 ; i<5 ; i++){

                al.add(sc.nextInt());
            }

            System.out.println(al);
    }
}
