import java.util.*;
public class hashmaps {
    public static void main(String args[]){

        HashMap<Integer,String> student = new HashMap<>();
        student.put(1,"ayush");
        student.put(2,"ayush");
        student.put(3,"bhavya");
        student.put(4,"hello");

        System.out.println(student.get(3));
    }
}