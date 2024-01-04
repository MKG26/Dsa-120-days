import java.util.ArrayList;
import java.util.List;

public class k32g {
    public static void main(String[] args) {

        List<List<Integer>> ans = subSeq(new int[]{1,2,3});

        for(List<Integer> n:ans){

            System.out.println(n);
        }
    }

    static List<List<Integer>> subSeq(int[] arr){

        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for(int i=0; i<arr.length; i++){

            start =0;

            if(i>0 && arr[i] == arr[i-1]){

                start = end +1;
            }

            end = outer.size() - 1;


            int n = outer.size();

            for(int j=0;j<n;j++){

                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
}

