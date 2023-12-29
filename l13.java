public class l13 {

    public static void main(String[] args) {

        System.out.println(romanToInt("III"));
    }

    public static int romanToInt(String s) {

        char[] arr = s.toCharArray();

        int st = 0;
        int count =0;

        while(st < s.length()){

            switch (arr[st]){

                case 'I':

                if(st < s.length()-1){

                    if (arr[st + 1] == 'V') {
                        count += 4;
                        st++;
                    } else if (arr[st + 1] == 'X') {
                        count += 9;
                        st++;
                    }else{
                        count++;
                    }



                }else{
                    count ++;
                }


                    break;

                case 'V':
                    count += 5;
                    break;

                case 'X':

                    if(st < s.length()-1){

                        if (arr[st + 1] == 'L') {
                            count += 40;
                            st++;
                        } else if (arr[st + 1] == 'C') {
                            count += 90;
                            st++;
                        }
                        else{
                            count += 10;
                        }


                    }
                    else{
                        count += 10;
                    }



                    break;

                case 'L':
                    count += 50;
                    break;

                case 'C':

                    if(st < s.length()-1){

                        if (arr[st + 1] == 'D') {
                            count += 400;
                            st++;
                        } else if (arr[st + 1] == 'M') {
                            count += 900;
                            st++;
                        }
                        else{

                            count += 100;
                        }

                    }else{

                        count += 100;
                    }


                    break;

                case 'D':
                    count += 500;
                    break;

                case 'M':
                    count += 1000;
                    break;
            }



            st++;



        }

        return count;
    }
}
