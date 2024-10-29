package java_util.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by nghiapv on 01/04/2017.
 */
public class List_01 {
    public static void main(String[] args) {
        List<Student> lst = new ArrayList<Student>();
        lst.add(new Student("Jimmy", 12));
        lst.add(new Student("Cartherna", 14));

        Object[] objs = lst.toArray();
        System.out.println(Arrays.toString(objs));

//        ***
        Student[] strs = new Student[2];
        strs = lst.toArray(strs);

        strs[0] = new Student("Carlos", 15);
        for (Student stu: strs
             ) {
            System.out.println(stu.getName());
        }
//        System.out.println(Arrays.toString(strs));

    }
}
