public class k32b {

    public static void main(String[] args) {

        System.out.println(removeAppNotApple("bappddah"));

    }

    static String removeAppNotApple(String s){

        if(s.isEmpty()){

            return "";
        }

        char ch = s.charAt(0);

        if(!s.startsWith("apple") && s.startsWith("app")){

            return removeAppNotApple(s.substring(3));

        }

        else{

            return ch + removeAppNotApple(s.substring(1));
        }

    }
}
