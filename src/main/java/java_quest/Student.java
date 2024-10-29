package java_quest;
import java.util.Objects;

public class Student {

    private final int age;
    private final String name;

    public Student(int age, String name) {
        this. age = age;
        this.name = name;

    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = 2 * hash + this. age;
        hash = 2 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public String toString() {
        return this.age + this.name;
    }
}
