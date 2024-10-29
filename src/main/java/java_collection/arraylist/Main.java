package java_collection.arraylist;

import java_collection.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {



        ArrayList arrlist=new ArrayList();
        Student student1 = new Student("123", "Cong", "cong@gmail.com", 22);
        Student student2 = new Student("123", "Cong", "cong@gmail.com", 22);
        Student student3 = new Student("456", "Dung", "dung@gmail.com", 18);
        arrlist.add(student1);
        arrlist.add(student2);
        arrlist.add(student3);

        System.out.println(Arrays.toString(arrlist.toArray()));

    }
}
