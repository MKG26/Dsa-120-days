import java.util.HashMap;

public class l242 {

    public static void main(String[] args) {

        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {


        HashMap<Character, Integer> hash = new HashMap<>();
        HashMap<Character, Integer> second = new HashMap<>();

        for(int i=0; i<s.length(); i++){

            if(!hash.containsKey(s.charAt(i))){

                hash.put(s.charAt(i), 1);
            }
            else{
                hash.put(s.charAt(i), hash.get(s.charAt(i))+1);
            }

        }

        for(int i=0; i<t.length(); i++){

            if(!second.containsKey(t.charAt(i))){
                second.put(t.charAt(i), 1);
            }
            else{

                second.put(t.charAt(i), second.get(t.charAt(i))+1);
            }
        }


        for(int i=0; i<s.length(); i++){

            if(hash.get(s.charAt(i)) == second.get(s.charAt(i))){
                return true;
            }
            else{
                return false;
            }
        }

        return false;
    }
}
