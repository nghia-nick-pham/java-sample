package java_quest;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
//        System.out.println(Objects.hashCode("ab"));
        Student s = new Student(10, "sg");
        Student s2 = new Student(11, "xg");
        System.out.println(s.toString());
        System.out.println(s2.toString());
    }
}
