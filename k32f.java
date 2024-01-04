import java.util.ArrayList;
import java.util.List;

public class k32f {

    public static void main(String[] args) {

        List<List<Integer>> ans = subSeq(new int[]{1,2,3});

        for(List<Integer> n:ans){

            System.out.println(n);
        }
    }

    static List<List<Integer>> subSeq(int[] arr){

        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num : arr){

            int n = outer.size();

            for(int i=0;i<n;i++){

                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }
}
