public class customQueue {

    private int[] data;

    public static final int DEFAULT_SIZE = 10;

    int end = 0;

    public customQueue(){
        this(DEFAULT_SIZE);
    }

    public customQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){

        return end == data.length;
    }

    public boolean isEmpty(){

        return end == 0;
    }

    public boolean insert(int val){

        if(isFull()){
            return false;
        }

        data[end++] = val;

        return true;
    }

    public int delete() throws Exception{

        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }

        int remove = data[0];

        for(int i=1; i<end; i++){

            data[i-1] = data[i];
        }
        end--;

        return remove;
    }

    public void display(){

        for(int i=0; i<end; i++){

            System.out.print(data[i]+"<-");
        }

        System.out.print("null");
    }

    public static void main(String[] args) {

        customQueue q = new customQueue();

        q.insert(5);

        q.display();
    }
}
