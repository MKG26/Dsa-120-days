public class towerOfHanoi {

    public static void main(String[] args) {

        tower(3,'A','B','C');
    }

    public static void tower(int n, char src, char aux, char des){

        if(n == 1){

            System.out.println(src+"->"+des);
            return;
        }

        tower(n-1, src,des,aux);
        tower(1,src,aux,des);
        tower(n-1, aux,src,des);
    }
}
