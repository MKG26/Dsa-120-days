import java.util.HashMap;

public class l13c {
    public static void main(String[] args) {

        System.out.println(romanToInt("III"));
    }

    public static int romanToInt(String s) {



        int result = getVal(s.charAt(s.length()-1));

        for(int i= s.length()-2; i>=0; i--){

            if(getVal(s.charAt(i)) < getVal(s.charAt(i+1))){

                result -= getVal(s.charAt(i));

            }
            else{

                result += getVal(s.charAt(i));
            }

        }


        return result;

    }

    static int getVal(char s){

        switch (s){

            case 'I':
                return 1;


            case 'V':
                return 5;


            case 'X':

                return 10;

            case 'L':
                return 50;


            case 'C':

               return 100;




            case 'D':
                return 500;


            case 'M':
                return 1000;

        }

        return 0;
    }
}


