import java.util.ArrayList;

public class k28e {
    public static void main(String[] args) {



        System.out.println(find(new int[] {1,2,3,4,5}, 3, 0, new ArrayList<Integer>()));
    }

    static ArrayList<Integer> find(int[] arr, int target, int i , ArrayList<Integer> list) {

        if(i == arr.length){


            return list;
        }

        if(arr[i] == target){
            list.add(i);
        }

            return find(arr, target, i+1, list);
    }
}
