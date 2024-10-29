package java_algorithm.linkedlist_leetcode.reverse_linked_list;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode next;
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null)
        {
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        head=prev;
        return head;
    }


}
