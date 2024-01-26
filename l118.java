import java.util.ArrayList;
import java.util.List;

public class l118 {

    public static void main(String[] args) {
        System.out.println( generate(3));
    }


    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();


        getRow(numRows+1, ans, 1);


        return ans;

    }


    public static void getRow(int row, List<List<Integer>> anss , int count ) {



        if(count == row){
            return;
        }




        List<Integer> ans = new ArrayList<>();

        ans.add(1);

        int temp =1;


        for(int i=1; i< count; i++) {


            temp *= count - i;
            temp = temp / i;


            ans.add(temp);

        }




        anss.add(new ArrayList<>(ans));



        getRow(row, anss , count+1);





    }
}
