import java.util.ArrayList;
import java.util.List;

public class k34e {

    public static void main(String[] args) {

        System.out.println(dice("", 3));
    }

    static List<String> dice(String p, int target){

        if(target == 0){

            List<String> nn = new ArrayList<>();
            nn.add(p);
            return nn;

        }

        List<String> ans = new ArrayList<>();

        for(int i=1;  i <= target ; i++ ){

            ans.addAll(dice(p+i , target-i));
        }

        return ans;
    }

}
