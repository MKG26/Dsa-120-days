public class l875 {
    
    public static void main(String args[]){
    
        int[] arr = {805306368,805306368,805306368};

        System.out.println(minEatingSpeed(arr, 1000000000));
    
    }

    static int minEatingSpeed(int[] piles, int h) {
        
        
        int high = Integer.MAX_VALUE;

        int low =1;

        while(low<high){

            int mid = (high + low)/2;

            int totalH = totalHour(piles, mid);

            if(totalH < h){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }

        return low;


    }

    static int totalHour(int[] arr, int h){

        int hour = 0;
        
        for(int i : arr){

            int hh = i/h;

            hour += hh;

            if(i%h != 0)
                hour++;
        }

        return hour;
    }

    static int max(int[] arr){


        int ans = arr[0];

        for(int i=1; i<arr.length; i++){

            

            if(ans < arr[i]){
                ans = arr[i];
            }
        }

        return ans;
    }
}
