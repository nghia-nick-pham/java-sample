package java_util.collection;

import java.util.*;
import java.util.function.ToIntFunction;

/**
 * Created by nghiapv on 01/04/2017.
 */
public class Comparator_01 {

    public static class StringComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            if(o1.equalsIgnoreCase(o2))
                return o1.compareTo(o2);
            return o1.toUpperCase().compareTo(o2.toUpperCase());
        }

    }

    public static class IntegerComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }
    }

    public static class CustomerComparator implements Comparator<Customer>{
        @Override
        public int compare(Customer o1, Customer o2) {
            return o1.getId() - o2.getId() ;
        }
    }


    public static void main(String[] args) {
        String[] arr = {"c","C","A","a","B","b", "D" };

        Comparator<String> comparator = new StringComparator();

        Arrays.sort(arr, comparator);
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.binarySearch(arr, "z",comparator));
//
        List<Integer> lst = new ArrayList<Integer>();
        lst.add(5);
        lst.add(3);
        lst.add(7);

        Comparator<Integer> comparatorLst = new IntegerComparator();
        Collections.sort(lst, comparatorLst);
        System.out.println(lst);


    }
}
