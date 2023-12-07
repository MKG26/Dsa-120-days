

public class recuuu{

    public static void main(String args[]){

        func(1);
    }

    static void func(int temp){

        System.out.println(temp);

        if(temp == 5){
            return;
        }
        func(++temp);
    }
}




