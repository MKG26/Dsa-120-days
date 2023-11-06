import java.util.Arrays;
import java.util.Scanner;

public class rotate1Array {


    
    public static void main(String args[]){
    

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        

        int[] arr = new int[256];
        Arrays.fill(arr, 0);
        
        for(int i=0; i<s.length(); i++){

            arr[s.charAt(i)]++;
        }
        
        int n = sc.nextInt();
        
        while(n>0){
            
            char c = sc.next().charAt(0);

            System.out.println(arr[c]);

            n--;
        }
    
    }
}
