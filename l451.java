import java.util.HashMap;

public class l451 {

    public static void main(String[] args) {

        System.out.println(frequencySort("tree"));
    }

    public static String frequencySort(String s) {


        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i=0; i<s.length(); i++){

            if(!hm.containsKey(s.charAt(i))){

                hm.put(s.charAt(i), 1);
            }
            else{

                hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
            }
        }


        StringBuilder sb = new StringBuilder();

        int max = s.length();

        for(int k=0; k<s.length();k++) {

            if(max == 0){
                break;
            }
            for (int j = 0; j < s.length(); j++) {

                if (hm.get(s.charAt(j)) == max) {

                    hm.put(s.charAt(j),0);

                    for (int i = 0; i < max; i++) {
                        sb.append(s.charAt(j));
                    }




                }


            }

            max--;

        }


        return sb.toString();
    }
}
