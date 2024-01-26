import java.util.ArrayList;
import java.util.List;

public class l119b {

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }

    public static List<Integer> getRow(int rowIndex) {

        int row = rowIndex+1;

        List<Integer> ans = new ArrayList<>();

        ans.add(1);

        int temp =1;


        for(int i=1; i< row; i++) {


            temp *= row - i;
            temp = temp / i;


            ans.add(temp);

        }




        return ans;

    }
}
