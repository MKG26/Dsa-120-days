import java.util.ArrayList;
import java.util.List;

public class l78 {

    public static void main(String[] args) {

        for(List<Integer> num : subsets(new int[]{1,2,3})){

            System.out.println(num);
        }

    }

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ansList = new ArrayList<>();

        ansList.add(new ArrayList<>());

        for(int take : nums){

            int n = ansList.size();

            for(int i=0; i<n; i++){

                List<Integer> internal = new ArrayList<>(ansList.get(i));
                internal.add(take);
                ansList.add(internal);
            }
        }



        return ansList;

    }


}
