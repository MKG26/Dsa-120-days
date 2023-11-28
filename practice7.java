public class practice7 {
    
    public static void main(String args[]){
    
        System.out.println(sumOfn(5));

        
    }

    static int sumOfn(int n){

        if(n == 0){
            return 0;
        }

        return n + sumOfn(n-1);
    }


}
