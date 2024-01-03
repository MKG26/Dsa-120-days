public class k32a {

    public static void main(String[] args) {


        System.out.println(remove("baddah"));
    }

    static String remove(String s){

        if(s.isEmpty()){

            return "";
        }

        char ch = s.charAt(0);

        if(ch == 'a'){
            return remove(s.substring(1));
        }
        else {

            return ch + remove(s.substring(1));

        }

    }
}
