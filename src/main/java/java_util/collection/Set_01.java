package java_util.collection;

import java.util.*;

/**
 * Created by nghiapv on 01/04/2017.
 */
public class Set_01 {

    public static void main(String[] args) {
//        SortedSet<String> set = new TreeSet<String>();
//        Set<String> set = new HashSet<String>();
//
//        set.add("a");
//        set.add("c");
////        set.add("d");
////        set.add("a");
////        set.add("z");
//        System.out.println(set);
////        Object a;
//        Set<String> setClone = set;
//        System.out.println(setClone);
//        int i = setClone.hashCode();
//        System.out.println(i);


//        Iterator<String> iter = set.iterator();
//        while (iter.hasNext()){
//            String setIter = iter.next();
//            System.out.println(setIter);
//        }

//        LinkedHashSet dset = new LinkedHashSet();
//        dset.add(new Dog(2));
//        dset.add(new Dog(1));
//        dset.add(new Dog(3));
//        dset.add(new Dog(5));
//        dset.add(new Dog(4));
//        Iterator iterator = dset.iterator();
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//        }
//
//        Dog dog1 = new Dog(5);
//        Dog dog2 = new Dog(9);
//        System.out.println(String.valueOf(dog1.compareTo(dog2)));

        Random r = new Random();

        HashSet hashSet = new HashSet();
        TreeSet treeSet = new TreeSet();
        LinkedHashSet linkedSet = new LinkedHashSet();

        long startTime;
        long endTime;
        long duration;
        // start time
        startTime = System.nanoTime();
// start time
        for (int i = 0; i < 1000; i++) {
            int x = r.nextInt(1000 - 10) + 10;
            linkedSet.add(new Dog(x));
        }
// end time
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedHashSet: " + duration);
// start time
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int x = r.nextInt(1000 - 10) + 10;
            hashSet.add(new Dog(x));
        }
// end time
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("HashSet: " + duration);

// start time
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int x = r.nextInt(1000 - 10) + 10;
            treeSet.add(new Dog(x));
        }
// end time
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("TreeSet: " + duration);


    }
}
