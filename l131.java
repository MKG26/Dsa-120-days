import java.util.ArrayList;
import java.util.List;

public class l131 {

    public static void main(String[] args) {

        System.out.println(partition("aab"));

    }

    public static List<List<String>> partition(String s) {


        List<List<String>> ans = new ArrayList<>();


        find(0, s, new ArrayList<>(), ans);

        return ans;


    }

    static void find(int ind, String s, List<String> ds, List<List<String>> ans){

        if(ind == s.length()){

            ans.add(new ArrayList<>(ds));

            return;

        }


        for(int i = ind ; i<s.length(); i++){

            if(isPalindrome(s,ind, i)){

                ds.add(s.substring(ind, i+1));
                find(i+1, s, ds, ans);
                ds.remove(ds.size()-1);

            }
        }
    }

     static boolean isPalindrome(String s, int start, int end) {

        while(start <= end){

            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }

        return true;
    }
}
