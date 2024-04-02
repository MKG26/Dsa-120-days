public class zeroesInNum {

    public static void main(String[] args) {

        zeroes(10305);

        System.out.println(count);
    }

    static int count = 0;
    private static void zeroes(int n) {



        int rem = n%10;

        if(rem == 0){
            count++;
        }

        if(n%10 == n){
            return;
        }



        zeroes(n/10);


    }


}
