import java.util.*;

public class bits2 {
    public static void main(String args[]){

        int i = 5;

        int pos = 2;

        int bitMask = 1<<pos;

        int newBitMask = ~(bitMask);

        int v = newBitMask & i;

        System.out.println(v);
           
           
    }
}
