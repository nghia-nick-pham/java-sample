package java_functional_programming.default_method;

import java.util.Comparator;

public class ComparatorByAge implements java.util.Comparator<Tree> {

    public int compare(Tree o1, Tree o2){
        return o1.getAge() - o2.getAge();
    }

    @Override
    public Comparator<Tree> reversed() {
        return Comparator.super.reversed();
    }
}
