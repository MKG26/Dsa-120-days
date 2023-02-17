import java.util.*;
import java.util.Scanner;

public class reverseword {

public static void main(String args[]){



    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    char arr[] = new char[26];

        for(int i =0; i<s.length(); i++){

            char ch = s.charAt(i);

            int number =0;

            if(ch>='a' && ch<='z'){
                number = ch-'a';

            }else{
                number = ch-'A';
            }

            arr[number]++;
            

        }

        int maxi=-1, ans=0;

        for(int i=0; i<26; i++){
            
            if(maxi < arr[i]){
                ans = i;
                maxi = arr[i];
            }
            
           

        }

            char t = (char)('a'+ans);
            System.out.println(t);
}
    
}
