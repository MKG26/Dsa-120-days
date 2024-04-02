import java.util.Scanner;

public class nowww {


    static Nodee create(){

        int data;

        Scanner sc = new Scanner(System.in);

        Nodee root =  null;

        System.out.println("Enter Value");

        data = sc.nextInt();

        if(data == -1){
            return null;
        }

        root = new Nodee(data);

        System.out.println("left" + root.data);
        root.left= create();

        System.out.println("right"+root.data);
        root.right = create();

        return root;


    }

    static void preorder(Nodee root){
        if(root == null){
            return;
        }

        System.out.println(root.data);

        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {

        Nodee root = create();

        preorder(root);
    }
}

class Nodee{
    int data;

    Nodee left;
    Nodee right;

    public Nodee(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
