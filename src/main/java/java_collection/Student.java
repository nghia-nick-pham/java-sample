package java_collection;

public class Student {
    private String id;
    private String name;
    private String email;
    private int age;

    public Student(String id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String toString() {
        String studentInfo = "Student " + id;
        studentInfo += ": " + name;
        studentInfo += " - " + email;
        studentInfo += " - " + age;
        return studentInfo;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student another = (Student) obj;
            if (this.id.equals(another.id) &&
                    this.name.equals(another.name) &&
                    this.email.equals(another.email) &&
                    this.age == another.age) {
                return true;
            }
        }
        return false;
    }


    public int hashCode() {
        assert false : "hashCode not designed";
        return 31;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
