package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by nghiapv on 20/03/2017.
 */
public class Overview {
    public static void main(String[] args) {
        List<String> names1 = new ArrayList<String>();
        names1.add("Mahesh ");
        names1.add("Suresh ");
        names1.add("Ramesh ");
        names1.add("Naresh ");
        names1.add("Kalpesh ");

        Overview test = new Overview();
        test.sortJ8(names1);
        for (String name:names1
             ) {
            System.out.print(name);
            if( (names1.indexOf(name) + 1) < names1.size() )
                System.out.print(" ;");
        }
    }

//    private void sortJ7( List<String> names ){
//        Collections.sort(names, new Comparator<String>() {
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//    }

    private void sortJ8( List<String> names ){
        Collections.sort(names, (o1, o2) -> o1.compareTo(o2) );
    }
}
