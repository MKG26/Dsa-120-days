public class CLL {

    Node head;

    Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    private class Node{

        int value;

        Node next;


        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


    public void insert(int val){

        Node node = new Node(val);

        if(head == null){

            head = node;
            tail = node;
        }

        tail.next = node;
        node.next = head;
        tail = node;

    }

    public void delete(int val){

        Node temp = head;

        if(temp == null){
            return;
        }

        while(temp.value != val){

            if(temp.next.value == val){

                temp.next = temp.next.next;
                break;
            }

            temp = temp.next;
        }

        if (temp.value == val){
            head = temp.next;
            tail.next = head;
        }

    }


    public void display(){

        Node temp = head;

        if(head != null){

            do{

                System.out.print(temp.value + "->");
                temp = temp.next;
            }while(temp != head);


        }



    }


    public static void main(String[] args) {

        CLL list = new CLL();

        list.insert(1);
        list.insert(2);
        list.insert(3);

        list.delete(2);


        list.display();
    }


}
