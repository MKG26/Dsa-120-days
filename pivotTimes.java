public class pivotTimes {
    
    public static void main(String args[]){
    
        int[] arr = {4,5,6,1,2,3};

        int ans = pivot(arr);

        System.out.println(ans+1);
    
    }

    static int pivot(int[] arr){

        int start = 0;

        int end = arr.length -1;

        while(start<= end){

            int mid = start +((end- start)/2);

            if(arr[mid]>arr[mid+1]){
                return mid;

            }
            else if(arr[mid]<arr[mid-1]){
                return mid -1;
            }
             if(arr[mid] <arr[start]){
                end = mid -1;
             }
             else{
                start = mid +1;
             }
        }

        return -1;
    } 
}
