package java8.function_identity;

public class Student {
    private Long id;
    private String name;
    private Integer age;
    public Student(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }

    //equals and hashcode left out for brevity (not mandatory for the examples to be seen)

    @Override
    public String toString() {
        return "[" + id + ", " + name + "]";
    }
}
