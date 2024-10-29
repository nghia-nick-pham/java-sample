package java_recursive.implementation.reference_type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursiveListModification {

    public static void modifyList(List<Integer> list) {
        if (list.isEmpty()) {
            return; // Base case
        }
        list.set(0, list.get(0) + 1); // Modify the first element
        modifyList(list.subList(1, list.size())); // Recursive call on the sublist
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        modifyList(list);
        System.out.println(list); // Output: [2, 2, 3]
    }
}
