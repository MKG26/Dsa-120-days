import java.util.*;             

public class reverse2 {     
    public static void main(String args[]){
    
        Vector<Integer> v = new Vector<Integer>();

        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);

        Vector<Integer> ans = new Vector<Integer>();

        ans = reverse(v);

        System.out.println(v);
    }

    
    public static Vector<Integer> reverse(Vector<Integer> v){

        int s = 3 , e = v.size()-1;

            while(s<e){
                Collections.swap(v,s,e);
                s++;
                e--;
            }

            return v;
        
    }
}
