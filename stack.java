import java.util.*;

public class stack {

    public static void main(String args[]){
        Stack<Integer> num = new Stack<>();
        num.push(1);
        num.push(2);
        num.push(3);
        num.push(4);
        num.push(5);

        int len = num.size();

        for(int i=0;i<len;i++){
            System.out.println(num.pop());
        }
    }
    
}
