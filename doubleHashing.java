 import java.util.Arrays;

public class doubleHashing {
    

    public static void main(String args[]){
    
        int arr[] = { 20,34,45,70,56};

        int N = 5;

        int L = 11;
        int[] hash_code = new int[11];
        
        for(int i=0; i<L; i++){

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

                    int t = 8 - (arr[i] % 8);

                    int in = (hv + j*t) % tsize;

                    if(table[in] == -1){
                        table[in] = arr[i];
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


