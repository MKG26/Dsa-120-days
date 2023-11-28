public class practice6 {
    public static void main(String args[]){
    
        bactra(1,5);
    
    }

    static void bactra(int i,int n){

        if(i>n){
            return;
        }

        bactra(i+1, n);
        System.out.println(i);

    }
}
