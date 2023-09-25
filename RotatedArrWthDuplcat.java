public class RotatedArrWthDuplcat {
    
    public static void main(String args[]){
    
        int[] arr = {2,2,2,5,2,2};

        System.out.println(pivot(arr));
        
    }

    static int pivot(int[] arr){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            int mid = start + ((end - start)/2);

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            if(arr[start] == arr[mid] && arr[mid] == arr[end]){

                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                if(arr[end]<arr[end-1]){
                    return end -1;

                }
                end--;
            }

                else if(arr[start]<arr[mid] || (arr[start] == arr[mid] && arr[mid]> arr[end])){
                    start = mid +1;
                }
                else{
                    end = mid-1;
                }
            
            
        }

        return -1;
    }
}
