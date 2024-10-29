package java_util.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * Created by nghiapv on 02/04/2017.
 */
public class Queue_02 {

    public static void main(String[] args) {
        Deque deque = new ArrayDeque();

        deque.push("Thursday");
        deque.push("Wednesday");
        deque.push("Tuesday");
        deque.push("Monday");
        System.out.println(deque);

        deque.remove();
        System.out.println(deque);
    }

}
