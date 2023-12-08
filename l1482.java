public class l1482 {

    public static void main(String[] args) {

        int[] arr = {1,10,3,10,2};

        System.out.println(minDays(arr,3,1));
    }

    static int minDays(int[] bloomDay, int m, int k) {

        if(m*k>bloomDay.length){
            return -1;
        }

        int min = findmin(bloomDay);
        int max = findmax(bloomDay);

        for(int i=min ; i<= max; i++){

            if(possible(bloomDay, i, m , k)){

                return i;
            }

        }

        return -1;
    }

    private static boolean possible(int[] bloomDay, int day, int m, int k) {

        int count =0;
        int noOfBouet = 0;

        for(int i=0; i<bloomDay.length; i++){

            if(bloomDay[i] <= day){
                count++;
            }
            else{
                noOfBouet += count/k;
                count = 0;
            }
        }

        noOfBouet += count/k;

        if(noOfBouet >= m){
            return true;
        }

        return false;
    }

    private static int findmax(int[] bloomDay) {

        int max = bloomDay[0];

        for(int i=1; i<bloomDay.length; i++){

            if(max<bloomDay[i]){
                max = bloomDay[i];
            }
        }

        return max;

    }

    private static int findmin(int[] bloomDay) {

        int min = bloomDay[0];

        for(int i=1; i<bloomDay.length; i++){
            if(min>bloomDay[i]){
                min = bloomDay[i];
            }
        }


        return min;
    }
}
