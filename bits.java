import java.util.*;


public class bits {
    public static void main(String args[]){

        int i = 5;

        int pos = 2;

        int bitMask = 1<<pos;

        if ((i & bitMask) == 0){
            System.out.println("bit is zero");
        }
        else{
            System.out.println("bit is 1");
        }




    }    
}
