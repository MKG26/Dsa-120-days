public class classs1{

    public static void main(String args[]){
    
        for(int i=0; i<11; i++){
            System.out.println(fibFormula(i));
        }
    
    }

    static int fibFormula(int n){

        return (int)((Math.pow(((1 + Math.sqrt(5))/2),n) - Math.pow(((1 - Math.sqrt(5))/2),n))/Math.sqrt(5));

    }
}