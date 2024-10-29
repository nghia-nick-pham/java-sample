package java_util.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by T450 on 4/19/2017.
 */
public class Array_01 {

    public static void main(String[] args) {
        Set<String> productCustomers = new HashSet<String>(){{
            add("congo");
            add("Nigeria");
            add("South Africa");
        }};
        System.out.println(productCustomers.contains("South Africa"));
    }
}
