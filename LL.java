public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

    public void insertFirst(int val){

        Node node = new Node(val);

        node.next = head;

        head = node;

        if(tail == null){

            tail = head;
        }

        size ++;

    }

    public void insertLast(int val){

        if(tail == null){

            insertFirst(val);
            return;
        }

        Node node = new Node(val);

        tail.next = node;

        tail = node;

        size++;

    }

    public void display(){

        Node temp = head;

        while(temp != null){

            System.out.println(temp.value + " ");
            temp = temp.next;
        }


    }





    public static void main(String[] args) {

        LL list = new LL();

        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);

        list.insertLast(5);

        list.display();
    }
}
