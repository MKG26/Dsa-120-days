import java.util.Stack;

public class l151 {

    public static void main(String[] args) {

        System.out.println(reverseWords(" asdasd df f"));
    }

    public static String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();
        Stack<String> st = new Stack<>();

        int size = s.length();

        for(int i=0; i<=size-1; i++){

            if(s.charAt(i)!=' '){

                sb.append(s.charAt(i));
            }
            else if(i<=s.length()-2 &&  !st.isEmpty()   && s.charAt(i+1) != ' ') {
                sb.append(" ");
                st.push(sb.toString());
                sb.delete(0,sb.length());
            }
            else if(i<s.length()-2 && s.charAt(i+1) != ' '){
                st.push(sb.toString());
                sb.delete(0,sb.length());
            }

        }

        sb.append(" ");

        for(int i=st.size()-1; i>=0; i--){

            sb.append(st.pop());
        }

        for(int i=sb.length()-1; i>=0 ; i--){

            if(sb.charAt(i) == ' '){

                sb.deleteCharAt(i);
            }
            else{
                break;
            }
        }

        return sb.toString();

    }
}
