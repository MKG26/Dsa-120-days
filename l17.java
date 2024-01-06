import java.util.ArrayList;
import java.util.List;

public class l17 {

    public static void main(String[] args) {

        System.out.println(letterCombinations("2,3"));
    }


    public static List<String> letterCombinations(String digits) {


        List<String> ans = padRet("", digits);

        return ans;


    }

    static List<String> padRet(String p,String up){

        List<String> anss = new ArrayList<>();

        if(up.isEmpty()){

            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        int digit = up.charAt(0) - '0';

        if(digit == 8){

            for(int i = ((digit-2)*3)+1 ; i<= (digit-1)*3; i++){

                char ch = (char)(i + 'a');
                anss.addAll(padRet(p+ch, up.substring(1)));
            }
        }

        if(digit == 7 ){

            for(int i = ((digit-2)*3) ; i<= (digit-1)*3; i++){

                char ch = (char)(i + 'a');
                anss.addAll(padRet(p+ch, up.substring(1)));
            }

        }


        if(digit == 9){

            for(int i = ((digit-2)*3)+1 ; i<= ((digit-1)*3)+1; i++){

                char ch = (char)(i + 'a');
                anss.addAll(padRet(p+ch, up.substring(1)));
            }
        }








        if (digit < 7) {
            for(int i = (digit-2)*3; i< (digit-1)*3; i++){

                char ch = (char)(i + 'a');
                anss.addAll(padRet(p+ch, up.substring(1)));
            }
        }


        return anss;

    }

}
