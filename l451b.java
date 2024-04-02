import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class l451b {

    public static void main(String[] args) {

        System.out.println(frequencySort("tree"));
    }

    public static String frequencySort(String s) {


        HashMap<Character,Integer> hm = new HashMap<>();

        for(char c : s.toCharArray()){

            hm.put(c , hm.getOrDefault(c,0)+1);
        }

        List<Character>[] bucket = new List[s.length()+1];

        for(Character key: hm.keySet()){
            int freq = hm.get(key);

            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(key);
        }


        StringBuilder sb = new StringBuilder();

        for(int i = bucket.length-1; i>0; i--){

            if(bucket[i] != null){

                for(char c : bucket[i]){

                    for(int j=0; j< hm.get(c); j++){

                        sb.append(c);
                    }
                }
            }
        }


        return sb.toString();
    }
}

