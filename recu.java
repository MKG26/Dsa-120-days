public class recu {

    public static void main(String args[]){
    
        func(5);
    
    }

    static void func(int temp){

        System.out.println(temp);

        if(temp ==1){
            return;
        }

        func(--temp`);
    }
    
}
