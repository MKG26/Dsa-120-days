import java.util.*;


public class remove {
    
    public static void main(String args[]){
    
        String s = "mohit";

        String part = "hit";

        StringBuilder sb = new StringBuilder();

        for(int i=0 ; i<s.length(); i++){

            sb.append(s.charAt(i));

            if(sb.length()>=part.length()){
             if(sb.substring(sb.length()-part.length()).equals(part)){
                sb.setLength(sb.length()- part.length());
            }
        }
        }
        

        System.out.println(sb);
    
    }
}
