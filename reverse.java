import java.util.*;

public class reverse {

public static void main(String args[]){
    
    Vector<Integer> v = new Vector<Integer>();

    v.add(1);
    v.add(2);
    v.add(3);

    Collections.reverse(v);
    System.out.println(v);
}
}
