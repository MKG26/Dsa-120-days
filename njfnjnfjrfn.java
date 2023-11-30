import java.util.ArrayList;
import java.util.List;

public class njfnjnfjrfn {
    public static void main(String args[]){
    
        int[] arr = {1,2,3};
        
        nextPermutation(arr);
    
    }

     public static void nextPermutation(int[] nums){

        List<List<Integer>> list = new ArrayList<>();

        List<Integer> ds = new ArrayList<>();

        boolean freq[] = new boolean[nums.length];

        nextPermute(nums, list , ds , freq);

        System.out.println(find(nums, list));


    }

    static void nextPermute(int[] arr, List<List<Integer>> list, List<Integer> ds, boolean[] freq){

        if(ds.size() == arr.length){

            list.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0; i<arr.length; i++){

            if(!freq[i]){
                freq[i] = true;
                ds.add(arr[i]);
                nextPermute(arr, list, ds, freq);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }



        

    }

    static List<Integer> find(int[] arr, List<List<Integer>> list){


    List<Integer> listt = new ArrayList<>();

        for(int i=0; i<arr.length; i++){

            listt.add(arr[i]);
        }



        for(int i=0; i<list.size() ; i++){

            if(listt.equals(list.get(i)) && i == list.size()-1){

                return list.get(0);
            }
            else if(listt.equals(list.get(i))) {
                return list.get(i+1);
            }
           }

    return new ArrayList<>();

    }
}

