public class CountRotations {
    
    public static void main(String args[]){
    
        int[] arr = {4,5,6,1,2,3};

        System.out.println(countRotations(arr));
    
    }

    private static int countRotations(int[] arr) {
        
        int start = 0;
        int end = arr.length -1;

        while(start<=end){

            int mid = start + ((end - start)/2);

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid+1;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){
                return mid  ;
            }

            if(arr[start] > arr[mid]){
                end = mid -1 ;
            }
            else{
                start = mid +1;
            }
        }
        
        
        
        
        return -1;
    }
}
