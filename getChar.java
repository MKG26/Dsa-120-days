import java.util.*;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;


public class getChar {
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        char arr[] = new char[20];
        
        a.getChars(0,5,arr,0);
        
        System.out.println(arr[0]);
    
    }
}
