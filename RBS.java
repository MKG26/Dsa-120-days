public class RBS {

    public static void main(String args[]){
    
        int[] arr = {4,5,0,1,2,3} ;

        
        int ans = search(arr,2);

        System.out.println(ans);
    
    }

   
    static int search(int[] arr, int target){

    int start = 0;
    int pivot = pivot(arr);
    int end = arr.length -1;


    if(pivot == -1){
        return binarySearch(arr, target, 0, arr.length-1);
    }
    else if(arr[start]<=target){
        return binarySearch(arr, target, 0, pivot);
    }
    else {
        return binarySearch(arr, target, pivot+1,end );
    }
   }
   
   
   
   static int binarySearch(int[] arr, int target, int start, int end){

    while(start<=end){

       int mid = start +((end-start)/2);

        if(target>arr[mid]){
            start = mid+1;
        }
        else if(target<arr[mid]){
            end = mid-1;
        }else{
            return mid;
        }
    }

    return -1;
   }
   
   
    static int pivot(int[] arr){

        int start =0;
        int end = arr.length - 1;

        while (start<= end){

            int mid = start + ((end-start)/2);

            if(arr[mid]>arr[mid +1]){
                return mid;
            }
            if(arr[mid]<arr[mid-1]){
                return mid -1;
            }
            if(arr[mid]<arr[start]){
                end = mid - 1;
            }
            else{
                start = mid +1;
            }
        }

        return -1;
    }
    
}
