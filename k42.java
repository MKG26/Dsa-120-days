import java.util.Arrays;

public class k42<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public k42() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }

        data[size++] = num;
    }

    private void resize() {

        Object[] temp = new Object[data.length * 2];

        for(int i=0 ; i< data.length ; i++){

            temp[i] = data[i];
        }

        data = temp;
    }

    private T remove(){

        T removed = (T)(data[--size]);

        return removed;
    }

    private boolean isFull(){
        return size == data.length;
    }

    public T get(int index){

        return (T)data[index];
    }

    public int size(){

        return size;
    }

    @Override
    public String toString() {
        return "k42{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public void set(int index, T value){

        data[index] = value;
    }
    public static void main(String[] args) {


        k42<Integer> list = new k42<>();

        for(int i=0; i< 14; i++){

            list.add(2 * i);
        }

        System.out.println(list);
    }
}
