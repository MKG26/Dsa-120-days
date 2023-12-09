public class l1011 {
    public static void main(String[] args) {

        int[] arr = {5, 4, 5, 2, 3, 4, 5, 6};

        System.out.println(shipWithinDays(arr, 5));

    }

    public static int shipWithinDays(int[] weights, int days) {

        int max = maxi(weights);
        int min = maxEle(weights);

        int ans = 0;

        while(min<=max){

            int mid = min + ((max-min)/2);

            if (possible(weights, days, mid)){

                ans = mid;

                max = mid - 1;

            }
            else{


                min = mid +1;

            }
        }

        return ans;


    }

    static int maxEle(int[] arr){

        int max = 0;

        for(int i: arr){

            max = Math.max(max,i);
        }

        return max;
    }

    static boolean possible(int[] weights, int days , int mid){

        int count = 0;
        int time = 1;

        for(int i: weights){

            count += i;
            if(count  > mid){

                time++;
                count = i;

            }


        }


        return time <= days;
    }

    private static int maxi(int[] weights) {

        int count = 0;

        for(int i: weights){
            count += i;
        }

        return count;
    }
}
