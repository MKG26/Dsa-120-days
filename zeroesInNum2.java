public class zeroesInNum2 {

    public static void main(String[] args) {

        System.out.println(zeroes(1023900, 0));

    }

    private static int zeroes(int n, int count) {

        if(n%10 == 0){
            count++;
        }

        if(n%10 == n){
            return count;
        }


        return zeroes(n/10,count);
    }


}
