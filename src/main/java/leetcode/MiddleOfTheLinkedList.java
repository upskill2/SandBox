package leetcode;

import leetcode.tests.SinglyLinkedList;

public class MiddleOfTheLinkedList extends SinglyLinkedList {

    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        SinglyLinkedList<Integer> sl = new SinglyLinkedList();
        sl.add(1);
        sl.add(2);
        sl.add(3);
        sl.add(4);
        sl.add(5);
        new MiddleOfTheLinkedList().middleNode(sl.head);
    }

}
