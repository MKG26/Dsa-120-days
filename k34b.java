import java.util.ArrayList;
import java.util.List;

public class k34b {

    public static void main(String[] args) {

        System.out.println( letterCombinations("12"));
    }

    public static List<String> letterCombinations(String digits) {

        List<String> ans = padReq("", digits);

        return ans;


    }

    static List<String> padReq(String p, String up ){

        if(up.isEmpty()){

            List<String> temp = new ArrayList<>();
            temp.add(p);
            return temp;
        }

        List<String> ans = new ArrayList<>();

        int digit = up.charAt(0) - '0';

        for(int i = (digit-1)*3 ; i < digit*3; i++){

            char ch = (char)(i+'a');
            ans.addAll(padReq(p+ch, up.substring(1)));
        }

        return ans;
    }


}
