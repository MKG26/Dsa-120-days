public class l121 {
    public static void main(String args[]){
    
        int arr[] = {7,1,5,3,6,4};
        
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        
        int profit = 0;
        int minValue = prices[0];

        for(int i= 1; i<prices.length; i++){



            int cost = prices[i] - minValue;

            profit = Math.max(cost,profit);

            minValue = Math.min(minValue, prices[i]);

        }

        return profit;

    }




}
