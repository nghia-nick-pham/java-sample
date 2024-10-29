package java_collection.iterator;

import java_collection.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("123", "Cong", "cong@gmail.com", 22);
        Student student2 = new Student("123", "Cong", "cong@gmail.com", 22);
        Student student3 = new Student("456", "Dung", "dung@gmail.com", 18);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        Iterator<Student> iterator = studentList.iterator();
        Student studentPre = null;
        while (iterator.hasNext()){

            Student student = iterator.next();
            if(studentPre != null && student.getId().equalsIgnoreCase(studentPre.getId())){
                studentPre.setAge(student.getAge() + studentPre.getAge());
                System.out.println("foo");

                iterator.remove();
            }
            studentPre = student;
        }

        System.out.println("abc");
        System.out.println(studentList);


    }
}
