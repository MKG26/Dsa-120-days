import java.util.Scanner;

class stackk{

    static class Node {

        int data;

        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }}

        Node top = null;


        void push(Scanner sc) {
            System.out.println("Enter data");
            int data = sc.nextInt();
            Node new_Node = new Node(data);

            if (top == null) {
                top = new_Node;
            }
            else{

                new_Node.next = top;
                top = new_Node;
            }
        }

        void pop()
        {
            if(top == null){
                System.out.println("Stack is Empty");
            }
            else {
                top = top.next;
            }
        }

        void display(){

            Node temp = top;

            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

    }





public class stackUsingLinkedList {

    public static void main(String[] args) {

        int d;

        Scanner sc = new Scanner(System.in);

        stackk s = new stackk();

        int l;

        do {
            System.out.println("1 for push");
            System.out.println("2 for pop");
            System.out.println("3 for display");
            System.out.println("Enter");

            d = sc.nextInt();

            switch (d) {

                case 1: {
                    s.push(sc);
                    break;
                }
                case 2: {
                    s.pop();
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



