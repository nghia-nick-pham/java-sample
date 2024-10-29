package java_collection.mutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("b")) {
                iterator.remove(); // Safe removal during iteration
            }
        }
        System.out.println(list); // Output: [a, c, d]
    }
}
