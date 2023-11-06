import java.util.HashMap;
import java.util.Scanner;

public class hashMap {
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){

            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> hp = new HashMap<>();

        for(int i=0; i<n; i++){

            if(hp.containsKey(arr[i])){

                hp.put(arr[i], hp.get(arr[i])+1);
            }
            else{
                hp.put(arr[i], 1);
            }
        }

   

        int q = sc.nextInt();

        for(int i=0; i<q; i++){

            int number = sc.nextInt();

            System.out.println(hp.get(number));
        }

    
    }
}
