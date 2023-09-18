public class linearSearch {
    
    public static void main(String args[]){
    
        int[] arr = {4,5,3,9,24,67,23,89,90};

        int target = 6;

        int ans = search(arr, target);

        System.out.println(ans);
    
    }

    static int search(int arr[] , int target){

        if(arr.length == 0){
            return -1;
        }
        
        
        for(int i =0 ; i<arr.length; i++){

            int element = arr[i];

            if(element == target){

                return i;
            }
        }

        return -1;
    }
}
