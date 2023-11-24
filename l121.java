public class l121 {
    public static void main(String args[]){
    
        int arr[] = {7,1,5,3,6,4};
        
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        
        int profit = 0;

        for(int i= 1; i<prices.length; i++){

            int minValue = minVal(prices, 0, i-1);

            int max = prices[i] - minValue;

            if(max> profit){
                profit = max;
            }

        }

        return profit;

    }

    static int minVal(int[] arr, int start, int end){

        int min = arr[0];

        for(int i=start ;i <= end ; i++){

            if(min>arr[i]){

                min = arr[i];
            }
        }

        return min;
    }


}
