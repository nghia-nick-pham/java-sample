package java_algorithm.linkedlist_journal.reverse_linked_list;

public class MyLinkedList {
    public Node head;

    public static class Node {

        Node next;

        Object data;

        Node(Object data) {
            this.data = data;
            next = null;
        }
    }
}
