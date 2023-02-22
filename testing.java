import java.util.*;

public class testing {
    
    public static void main(String args[]){
    
        List<Integer> li = new ArrayList<Integer>();

        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);


            String s = li.toString();

           

            char ar[] = s.toCharArray();
    

            
            
            for(int i=0 ; i<ar.length; i++){
                System.out.println(ar[i]);
            }
    }
}
