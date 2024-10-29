package java_functional_programming.default_method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //data
        List<Tree> groupTree = new ArrayList<>();
        groupTree.add(new Tree("Papaya", 26));
        groupTree.add(new Tree("Mango", 39));
        groupTree.add(new Tree("Duran", 13));


        //define
        Comparator comparator = new ComparatorByAge();

        //using
//        groupTree.sort(comparator);
//        Collections.sort(groupTree, new ComparatorByAge());
        Collections.sort(groupTree, (a, b)->a.getAge()-b.getAge());

        //print
        for (Tree tree: groupTree
             ) {
            System.out.println(tree.getName());
        }
    }
}
