import java.util.ArrayList;

public class k33c {

    public static void main(String[] args) {

        System.out.println(permutationListCount("", "abcd"));

    }

    static int permutationListCount(String p, String up){

        if(up.isEmpty()){
            return 1;
        }

        int count = 0;



        char ch = up.charAt(0);

        for(int i=0; i<= p.length(); i++){

            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            count = count + permutationListCount(f + ch + s, up.substring(1));
        }

        return count;
    }
}
