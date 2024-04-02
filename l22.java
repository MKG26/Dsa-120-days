import java.util.ArrayList;
import java.util.List;

public class l22 {

    public static void main(String[] args) {

        for(String n : generateParenthesis(3)){

            System.out.println(n);
        }
    }

    public static List<String> generateParenthesis(int n) {

        List<String> outputArr = new ArrayList<>();

        backtrack(outputArr, "", 0, 0, n);

        return outputArr;

    }

    static void backtrack(List<String> outputArr, String currentString, int open , int close, int max){

        if(currentString.length() == max*2){

            outputArr.add(currentString);
            return;
        }

        if(open < max){
            backtrack(outputArr, currentString+"(", open+1, close, max);
        }

        if(close < open){
            backtrack(outputArr, currentString+")", open, close+1, max);
        }
    }
}
