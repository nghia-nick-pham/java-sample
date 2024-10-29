package java_collection;

import java.util.HashSet;
import java.util.Set;

public class EqualStudent3 {
    public static void main(String[] args) {
        Student student1 = new Student("123", "Cong", "cong@gmail.com", 22);
        Student student2 = new Student("123", "Cong", "cong@gmail.com", 22);
        Student student3 = new Student("456", "Dung", "dung@gmail.com", 18);

        Set<Student> setStudents = new HashSet<Student>();
        setStudents.add(student1);
        setStudents.add(student2);
        setStudents.add(student3);

        // in các phần tử của set ra màn hình
        for (Student student : setStudents) {
            System.out.println(student);
        }
    }
}
