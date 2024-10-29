package java_recursive.implementation.reference_type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursiveArrayList {

    public static void modifyList(List<Integer> list, int index) {
        if (index == list.size()) {
            return; // Base case
        }

        //Using Local Variables to not avoiding the function operates on the same object reference.
        List<Integer> listLocal = new ArrayList<>(list);

        listLocal.set(index, list.get(index) * 2); // Modify element

        modifyList(listLocal, index + 1); // Recursive call
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        modifyList(list, 0);
        System.out.println(list); // Output: [2, 4, 6, 8]
    }
}
