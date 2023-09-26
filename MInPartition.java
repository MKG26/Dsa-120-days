public class MInPartition {
    
    public static void main(String args[]){
    
        int[] arr = {7,2,5,8,10};
        
        System.out.println(splitArr(arr, 2));
        
    }

    static int splitArr(int[] arr, int m){

        int start = 0;
        int end = 0;
        

        
        for(int i=0; i<arr.length; i++){
            start = Math.max(start,arr[i]);

            end += arr[i];

        }

        while(start<end){

            int mid = start +((end-start)/2);

            int sum = 0;
            int pieces = 1;

            for(int nums : arr){
                if(sum+nums > mid){
                    
                    sum = nums;
                    pieces++;

                }
                else{
                    sum += nums;
                }
            }

            if(pieces>m){
                start = mid+1;
            }
            else{
                end = mid;
            }

            
        }
        return start;
    }
       
    }
    

