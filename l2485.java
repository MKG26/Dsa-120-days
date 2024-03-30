public class l2485 {

    public static void main(String[] args) {

        System.out.println(pivotInteger(8));
    }

    public static int pivotInteger(int n) {

        int sum = 0;

        for(int i=1; i<= n ; i++){

            sum += i;
        }


        int sum1 = 0;

        for(int i=1; i<= n ; i++){

            sum1 += i;

            if(sum1 == ((sum-sum1)+i)){

                return i;
            }
        }

        return -1;
    }
}


