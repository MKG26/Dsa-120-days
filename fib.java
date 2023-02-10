import java.util.*;  

class fib{
public static void main(String[] args){
    int n1=0,n2=1,n3;
     
    Scanner a = new Scanner(System.in);      
    System.out.print("Enter no terms in fibonacci series - ");  
    int b = a.nextInt();  


    System.out.print(+n1);
    System.out.print(" "+n2);

    for (int i=0;i<b;i++){
        n3=n2+n1;

        System.out.print(" "+n3);

        n1=n2;
        n2=n3;


    }
}
}