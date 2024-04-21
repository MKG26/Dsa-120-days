public class DLL {

    Node head;

    int size;

    public DLL() {
        this.size = 0;
    }

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

        size++;
    }

    public void insertLast(int val){



        Node node = new Node(val);

        node.next = null;

        if(head == null){

            node.prev = null;
            head = node;

            size++;
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

        size++;
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

        System.out.println();
    }


    public void insert(int val , int index){

        if(index == 0){

            insertFirst(val);
            return;
        }

        if(index == size){

            insertLast(val);
            return;
        }

        Node node = new Node(val);

        Node temp = head;

        Node last = null;

        for(int i=0; i< index ; i++){

            last = temp;
            temp = temp.next;
        }

        node.next = temp;
        temp.prev = node;
        node.prev = last;
        last.next = node;

        size++;

    }

    public void insertAfterNode(int val, int insertVal){

        Node node = new Node(insertVal);

        Node temp = head;

        while(temp != null){

            if(temp.value == val){

                node.next = temp.next;

                if(temp.next != null){
                    temp.next.prev = node;
                }


                temp.next = node;
                node.prev = temp;

                size++;

                return;

            }
                temp = temp.next;
        }
    }





    public static void main(String[] args) {

        DLL list = new DLL();

        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);

        list.insertLast(6);

        list.display();

        list.insert(10, 1);

        list.display();

        list.insertAfterNode(4, 13);

        list.display();
    }


}
