import java.util.Arrays;

public class maxval {

    public static void main(String args[]){
    
            int[] arr = {1 ,2,23,4,5, 74, 32,56};

            reverse(arr);

            System.out.println(Arrays.toString(arr));

        }


        static void swap(int[] arr , int index1, int index2){

            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;

        }
        



        static void reverse(int[] arr){

            int start = 0;
            int end = arr.length-1;
        
            
            
            while(start<end){

                swap(arr, start, end);

                start++;
                end--;

            }
        









//         static void maxRange(int[] arr, int start, int end){

//     int maxVal = arr[start];

//     for(int i =start ; i<end; i++){

//         if(arr[i]> maxVal){

//             maxVal = arr[i];
//         }
//     }

//     System.out.println(maxVal);
// }

}
}


