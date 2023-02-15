
public class gcd{

    public static void main(String args[]){
    
        int gcd = getGCD(5,4);

        System.out.println(gcd);


    
    }

    public static int getGCD(int n1, int n2){
            
        int gcd = 1;
        
        for(int i=1 ; i<=n1&& i<=n2; i++){
            if(n1%i==0&& n2%i==0){
                gcd =i;
            }
        }
        return gcd;
    }
}