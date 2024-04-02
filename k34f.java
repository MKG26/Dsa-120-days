import java.util.ArrayList;
import java.util.List;

public class k34f {

    public static void main(String[] args) {


        System.out.println(dice("", 4));

    }

    static int dice(String p, int target){

        if(target == 0){

            return 1;

        }


        int count =0;

        for(int i=1;  i <= target ; i++ ){

            count = count + dice(p+i , target-i);
        }

        return count;
    }
}
