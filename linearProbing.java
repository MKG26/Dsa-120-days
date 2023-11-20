import java.util.Arrays;

public class linearProbing {
    

    public static void main(String args[]){
    
        int arr[] = { 50, 700, 76, 85, 92, 73, 101 };

        int N = 7;

        int L = 7;
        int[] hash_code = new int[7];
        
        for(int i=0; i<N; i++){

            hash_code[i] = -1;
        }

        hashing(hash_code, L, arr, N);
    
    }

    static void hashing(int table[], int tsize, int arr[], int N){

        for(int i=0; i<N; i++){

            int hv = arr[i] % tsize;

            if(table[hv] == -1){
                table[hv] = arr[i];
            }
            else
            {
                for(int j =0; j<tsize; j++ ){

                    int t = (hv + j) % tsize;

                    if(table[t] == -1){
                        table[t] = arr[i];
                        break;
                    }
                }
            }
        }

        printArray(table);
    }

    static void printArray(int arr[]){

        System.out.println(Arrays.toString(arr));
    }
}

