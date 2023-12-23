public class k29a {

    public static void main(String[] args) {

        ntraingle(1,0);
    }

    static void ntraingle(int r, int c){

        if(r==5){
            return;
        }

        if(c<r){

            System.out.print("*");
            ntraingle(r,c+1);
        }
        else {

            System.out.println();
            ntraingle(r+1, 0);
        }
    }

    static void triangle(int r, int c){

        if(r == 0){
            return;
        }

        if(c<r){
            System.out.print("*");
            triangle(r,c+1);
        }
        else{

            System.out.println();
            triangle(r-1, 0);
        }

    }
}
