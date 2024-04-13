public class l1700 {

    public static int countStudents(int[] students, int[] sandwiches) {

        int one = 0;
        int zero = 0;

        for(int i=0; i< students.length ; i++){

            if(students[i] == 1){
                one++;
            }
            else{
                zero++;
            }
        }


        for(int i=0; i<sandwiches.length ; i++){

            if(sandwiches[i] == 1){

                one--;

                if(one == 0 && zero == 0){
                    return 0;
                }

            }
            else if (sandwiches[i] == 0){

                if(zero == 0){

                    return one + zero;
                }

                zero--;

                if(one == 0 && zero == 0){
                    return 0;
                }
            }
            else{

                return one + zero;
            }
        }

        return one + zero;

    }

    public static void main(String[] args) {

        System.out.println(countStudents(new int[]{1,1,0,0}, new int[]{0,1,0,1}));
    }
}
