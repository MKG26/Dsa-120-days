import java.util.Scanner;

class queue1{

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node f = null;
    Node r=null;

    public void enqueue(Scanner sc){
        System.out.println("Enter data");
        int data = sc.nextInt();
        Node new_node = new Node(data);

        if(f==null){

            f = new_node;
            r= new_node;
        }
        else{
            r.next = new_node;
            r = new_node;
        }
    }

    public void dequeue(){

        if(f == null){

            System.out.println("false");
        }
        else{
            f=  f.next;
        }
    }

    public void display(){

        Node temp = f;

        while(temp != null){

            System.out.println(temp.data);
            temp = temp.next;
        }

    }
}







public class queueUsingLinkedList {

    public static void main(String[] args) {

        int d;

        Scanner sc = new Scanner(System.in);

        queue1 s = new queue1();

        int l;

        do {
            System.out.println("1 for push");
            System.out.println("2 for pop");
            System.out.println("3 for display");
            System.out.println("Enter");

            d = sc.nextInt();

            switch (d) {

                case 1: {
                    s.enqueue(sc);
                    break;
                }
                case 2: {
                    s.dequeue();
                    break;
                }
                case 3: { 
                    s.display();
                    break;
                }
            }

            System.out.println("0 to Exit");

            l = sc.nextInt();
        }while(l==0);
        System.out.println("Exitted");

    }

}
