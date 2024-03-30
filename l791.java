import java.util.HashSet;
import java.util.Set;

public class l791 {

    public static void main(String[] args) {


        System.out.println(customSortString("cba", "abcd"));
    }

    public static String customSortString(String order, String s) {

        StringBuilder sb = new StringBuilder();

        Set<Character> set = new HashSet<>();

        int[] ca = new int[26];

        for(char i : order.toCharArray()){

            set.add(i);
        }

        for(char i : s.toCharArray()){

            if(!set.contains(i)){

                sb.append(i);
            }
            else{

                ca[i - 'a'] += 1;
            }
        }

        for(char i : order.toCharArray()){

            int c = ca[i - 'a'];

            while(c-- > 0){

                sb.append(i);
            }

        }

        return sb.toString();
    }
}
