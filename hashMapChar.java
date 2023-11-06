import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class hashMapChar {
    
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);

        String in = sc.next();

        char[] chAr = in.toCharArray();

        HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
       
        for(int i=0; i<chAr.length; i++){

            if(hm.containsKey(chAr[i])){

                hm.put(chAr[i], hm.get(chAr[i])+1 );

            }
            else{

                hm.put(chAr[i], 1);
            }
        }

        int q = sc.nextInt();



        for(int i=0; i<q; i++){

            char ch = sc.next().charAt(0);

            System.out.println(hm.get(ch));
        }
    
    }
}
