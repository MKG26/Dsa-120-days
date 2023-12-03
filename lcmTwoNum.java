public class lcmTwoNum {
    
    public static void main(String args[]){
    
        int a =9;
        int b = 12;

        int gcd = 1;

        for(int i=1; i<=a && i<=b; i++){

            if(a%i == 0 && b%i == 0){
                gcd = i;
            }
        }

        int lcm = (a*b)/gcd;

        System.out.println(lcm);
    
    }
}
