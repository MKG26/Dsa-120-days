public class recuu {

    public static void main(String[] args) {


        funBoth(5);

    }

    static void func(int temp){

        if(temp ==1){
            return;
        }

        func(--temp);

        System.out.println(temp);
    }

    static void funBoth(int n){

        if(n==0){
            return;
        }

        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }

}






