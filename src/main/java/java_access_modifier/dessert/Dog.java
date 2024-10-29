package java_access_modifier.dessert;


import java_access_modifier.forest.Animal;


public class Dog extends Animal {
    public Dog(String color) {
        super(color);
        System.out.println(this.color);
    }

    public static void main(String[] args) {
        Animal.raising();
        System.out.println(Animal.i);
    }
}
