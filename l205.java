import java.util.HashMap;

public class l205 {
    public static void main(String[] args) {

        System.out.println(isIsomorphic("egg","add" ));
    }

    public static boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }


        HashMap<Character, Character> containChar = new HashMap<>();

        for(int i=0; i<s.length(); i++){

            char first = s.charAt(i);
            char second = t.charAt(i);


            if(!containChar.containsKey(first)){

                if(!containChar.containsValue(second)){

                    containChar.put(first,second);
                }
                else{
                    return false;
                }
            }
            else{

                char check = containChar.get(first);

                if(check != second){
                    return false;
                }
            }

        }

        return true;
    }
}
