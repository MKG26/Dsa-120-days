public class classs {
    

    public static void main(String args[]){
    
        printN(10);
    
    }

    public static int printN(int n){

        if(n==0){
            return n;
        }

        printN(n-1);
        System.out.println(n);

        return -1;
    }
}
