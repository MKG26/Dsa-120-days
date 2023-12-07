public class ppalinddrronme {

    public static void main(String[] args) {

        System.out.println(palin(123421));
    }

    private static boolean palin(int n) {

        return n == rev(n);
    }

    private static int rev(int n) {

        int digits = (int)(Math.log10(n)) + 1;

        return helperr(n, digits);
    }

    private static int helperr(int n, int digits) {

        if(n%10 == n){
            return n;
        }

        int rem = n%10;


        return rem * (int)(Math.pow(10,digits-1)) + helperr(n/10, digits-1);
    }


}
