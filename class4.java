public class class4 {
    

    public static void main(String args[]){
    
        f1(5);

    
    }

    static void f1(int n){

        if(n>0)
            f2(n-1);
        

        System.out.println(n);
        
    }

    static void f2(int n){

        if(n>0)
            System.out.println(n);
        

        f1(n-2);
    }
}
