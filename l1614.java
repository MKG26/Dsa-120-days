import java.util.Stack;

public class l1614 {

    public static void main(String[] args) {

        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
    }

    public static int maxDepth(String s) {


        int max = 0;
        int count =0;

        for(int i=0; i<s.length(); i++){



            if(s.charAt(i) == '('){

                count++;

                if(max < count ){
                    max = count;
                }

            }
            else if(s.charAt(i) == ')'){

                count--;
            }
        }


        return max;
    }
}
