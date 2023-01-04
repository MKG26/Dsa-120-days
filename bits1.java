import java.util.*;

public class bits1 {
    public static void main(String args[]){

        int i = 5;

        int pos = 1;

        int bitMask = 1<<pos;

        int v = bitMask | i;

        System.out.println(v);
           
           
    }
}
