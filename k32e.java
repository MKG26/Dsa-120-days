import java.util.ArrayList;

public class k32e {

    public static void main(String[] args) {

        System.out.println(subseq("","abc", new ArrayList<>()));;
    }

    static ArrayList<String> subseq(String p, String up, ArrayList<String> ar){

        if(up.isEmpty()){

            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> st = new ArrayList<>();



          return subseq(p+ch, up.substring(1), st);




    }
}

