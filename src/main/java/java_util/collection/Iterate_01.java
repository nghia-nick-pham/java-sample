package java_util.collection;

import java.util.*;

/**
 * Created by nghiapv on 31/03/2017.
 */
public class Iterate_01 {


    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        Student student1 = new Student("a", 2);
        Student student2 = new Student("b", 3);
        Student student3 = new Student("c", 4);
        list.add(student1);
        list.add(student2);
        list.add(student3);

        System.out.println(list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Student iter = (Student) iterator.next();
            System.out.println(iter.getName() + " "  +iter.getAge());
        }
    }
}
