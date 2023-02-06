import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {



    public static String timeonversion(String s) {

  
       char ap = s.charAt(s.length()-2);
       
        s = s.substring(0,s.length()-2);
        
        if(ap=='A'){
            int hh = Integer.parseInt(s.substring(0,2));
            
            if(hh==12){
                hh=0;
                
            }
            String v = Integer.toString(hh);
            
            if(v.length()==1){
                v="0"+v;
            }
            
                s= (v+s.substring(2,s.length()));
        }
        else{
            int hh = Integer.parseInt(s.substring(0,2));
            
            if(hh != 12){
                hh += 12;
            }
            
            String v = Integer.toString(hh);
            
           
            
            s=(v+s.substring(2,s.length()));
            
            
        }
    
            String v = s;
            
            return v;
   
    }
    


}

public class timeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeonversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

