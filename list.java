import java.util.*;



public class list {

    public static void main(String args[]){
            List<Integer> arr = new ArrayList();

        arr.add(1);
        arr.add(2);
        arr.add(3);

        
        arr.add(2, 5);
        
        System.out.println(arr);

        List<Integer> newArr = new ArrayList();
        
            newArr.add(150);
            newArr.add(160);

            arr.addAll(newArr);


           System.out.println(arr);

            System.out.println(arr.get(2));
}
}
