package compare;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student Mohit = new Student(10, 99.99f);
        Student Kunal = new Student(9, 89.99f);
        Student Dev = new Student(12, 85.99f);

        Student[] list = {Mohit, Kunal, Dev};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list);

        System.out.println(Arrays.toString(list));

//        if (Mohit.compareTo(Kunal) > 0) {
//
//            System.out.println(Mohit.compareTo(Kunal));
//            System.out.println("Mohit has more marks");
//        }


    }
}
