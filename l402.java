import java.util.Stack;

public class l402 {

    public static void main(String[] args) {


        System.out.println(removeKdigits("10", 1));

    }

    public static String removeKdigits(String num, int k) {

        int size = num.length();

        if(size == k){

            return "0";
        }

        int counter = 0;

        Stack<Character> stack = new Stack<>();

        while(counter < size){

            while(k>0 && !stack.isEmpty() && stack.peek() > num.charAt(counter)){
                stack.pop();
                k--;
            }

            stack.push(num.charAt(counter));
            counter++;
        }


        while(k>0){
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();

        while(stack.size() != 0){

            char current = stack.pop();

            sb.append(current);

        }

        sb.reverse();


        while(sb.charAt(0) == '0' && sb.length() != 1){

            sb.deleteCharAt(0);
        }


        return sb.toString();
    }
}
