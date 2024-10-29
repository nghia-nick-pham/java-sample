package java_collection.hashmap;

import javax.swing.*;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Main1 {

    public static void main(String[] args) {
        Hashtable<String, Integer> numbers = new Hashtable<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("HashMap: " + numbers);

        // Accessing the key/value pair
        System.out.print("Entries: ");
        for(Map.Entry<String, Integer> entry: numbers.entrySet()) {
            System.out.print(entry);
            System.out.print(", ");
        }


    }
}
