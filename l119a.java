import java.util.ArrayList;
import java.util.List;

public class l119a {

    public static void main(String[] args) {
        System.out.println(getRow(1));
    }

    public static List<Integer> getRow(int rowIndex) {

        List<Integer> ans = new ArrayList<>();




        for(int i=1; i<= rowIndex+1; i++){

            ans.add(ele(rowIndex, i-1));
        }


        return ans;


    }


    static int ele(int row , int col){



        int result =1;

        for(int i=0; i<col ; i++){

            result *= row-i;
            result = result/(i+1);
        }

        return result;
    }
}
