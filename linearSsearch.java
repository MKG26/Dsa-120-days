import java.util.Arrays;

public class linearSsearch {

    public static void main(String args[]){
    
        String str = "Mohit";
        char target = 'h';

        System.out.println(search(str,target));
    
    }
    
    static boolean search(String str, char target){

        if(str.length() == 0){

            return false;
        }

        for(char ch : str.toCharArray()){

            if(ch == target){
                return true;
            }
        }

        return false;
    }
}
