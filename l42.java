import java.util.Arrays;

public class l42 {


    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public l42() {
       this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }

        data[size++] = num;
    }

    private void resize() {

        int temp[] = new int[data.length * 2];

        for(int i=0 ; i< data.length ; i++){

            temp[i] = data[i];
        }

        data = temp;
    }

    private int remove(){

        int removed = data[--size];

        return removed;
    }

    private boolean isFull(){
        return size == data.length;
    }

    public int get(int index){

        return data[index];
    }

    public int size(){

        return size;
    }

    @Override
    public String toString() {
        return "l42{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public void set(int index, int value){

        data[index] = value;
    }
    public static void main(String[] args) {


        l42 list = new l42();

        list.add(54);

        System.out.println(list);
    }
}
