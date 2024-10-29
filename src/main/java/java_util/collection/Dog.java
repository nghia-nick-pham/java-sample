package java_util.collection;

/**
 * Created by nghiapv on 01/04/2017.
 */
class Dog implements Comparable<Dog>{
    int size;

    public Dog(int s) {
        size = s;
    }

    public String toString() {
        return size + "";
    }

    @Override
    public int compareTo(Dog o) {
        return size - o.size;
    }
}
