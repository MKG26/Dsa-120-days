public class digitSum {

    public static void main(String[] args) {

        System.out.println(sum(1342));
    }

    static int sum(int temp){

        int digit = temp%10;

        temp = temp/10;


        if(temp ==0){
            return digit;
        }


        return digit + sum(temp);
    }
}
