package other.model;

//import lombok.Getter;
//import lombok.Setter;

/**
 * Created by T450 on 4/19/2017.
 */
//@Getter
//@Setter
public class Customer {
    private int id;
    private String name;
    private int age;

    public Customer() {
    }

    public Customer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {

        return super.equals(obj);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
