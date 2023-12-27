import java.util.Stack;

public class l20 {

    public static void main(String[] args) {

        System.out.println(isValid("()[]{}"));
    }

    public static boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){

            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){

                st.push(s.charAt(i));
            }
            else{

                if(st.isEmpty()){
                    return false;
                }

                    char t = st.pop();

                if((t == '(' && s.charAt(i) ==  ')') || (t == '[' && s.charAt(i) == ']') || (t == '{' && s.charAt(i) == '}') ){

                }else{
                    return false;
                }



            }
        }

        return true;
    }
}
