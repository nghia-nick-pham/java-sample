package java_util.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nghiapv on 01/04/2017.
 */
public class For_loop_01 {


    public static void main(String[] args) {
        List<StringBuilder> list = new ArrayList<StringBuilder>();
        list.add(new StringBuilder("Jim"));
        list.add(new StringBuilder("Tom"));


        for(StringBuilder item : list){
            item.append("123456789012345678901234567890");
        }

        System.out.println(list);


        List<Student> list1 = new ArrayList<Student>(2);
        list1.add(new Student("Jim", 10));
        list1.add(new Student("Tom", 12));


        Object[] objs = list1.toArray();

        for (Object obj: objs
             ) {
            Student student = (Student) obj;
            System.out.println(student.getName());
        }


    }

}
