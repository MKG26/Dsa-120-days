public class DLL {

    Node head;


    public class Node{


        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int val){

        Node node = new Node(val);

        node.next = head;
        node.prev = null;

        if(head != null){

            head.prev = node;
        }

        head = node;
    }

    public void insertLast(int val){



        Node node = new Node(val);

        node.next = null;

        if(head == null){

            node.prev = null;
            head = node;

            return;
        }

        Node temp = head;

        Node last = null;



        while(temp != null){

            last = temp;
            temp = temp.next;

        }

        node.prev = last;
        last.next = node;

    }

    public void display(){

        Node node = head;
        Node last = null;

        while(node != null){

            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }


        System.out.println("null");

        System.out.println("In Reverse");

        while(last != null){

            System.out.print(last.value + " -> ");
            last = last.prev;

        }

        System.out.println("null");
    }





    public static void main(String[] args) {

        DLL list = new DLL();

        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);

        list.insertLast(6);

        list.display();
    }


}
