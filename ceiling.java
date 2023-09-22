
// ceiling -> Smallest no <= target


public class ceiling {
      public static void main(String args[]){
    
        int[] arr = {-2,-1,0,1,2,3,5,6,7,8,9};


        System.out.println(search(arr,1));
    
    }

    static int search(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        if(target>arr[end]){
            return -1;
        }

        while(start<=end){

            int mid = (start + ((end-start)/2));

            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                 return mid;
            }


        }

        return start;


    }
    
}