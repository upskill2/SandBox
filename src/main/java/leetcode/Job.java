package leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Job {

    public static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;

        public int data() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public SinglyLinkedListNode next() {
            return next;
        }

        public void setNext(SinglyLinkedListNode next) {
            this.next = next;
        }
    }


    public static boolean hasCycle(SinglyLinkedListNode head) {
/*
        Set<Integer> visitedNodes = new HashSet<>();
        visitedNodes.add(head.data);

        SinglyLinkedListNode node1 = head.next;

        while (node1 != null ) {
            int integer = node1.data;

            if (visitedNodes.contains(integer)) {
                return true;
            }
            visitedNodes.add(integer);
            node1 = node1.next;
        }
        return false;*/

        SinglyLinkedListNode fast = head;
        SinglyLinkedListNode slow = head;

        if(head == null) return false;

        while(fast != null && fast.next != null){
            //move the fast poitnet by 2 nodes next and slow pointer by one node next
            fast = fast.next.next;
            slow = slow.next;
            //compaire fast and slow pointer address , if matches then cycle detected.
            if(fast == slow){
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {

        SinglyLinkedListNode node = new SinglyLinkedListNode();
        node.setData(1);

        SinglyLinkedListNode node1 = new SinglyLinkedListNode();
        node1.setData(2);
        node1.setNext(node);

        SinglyLinkedListNode node2 = new SinglyLinkedListNode();
        node2.setData(3);
        node2.setNext(node1);

        SinglyLinkedListNode node3 = new SinglyLinkedListNode();
        node3.setData(4);
        node3.setNext(node2);

        final boolean b = hasCycle(node);
        System.out.println(b);


    }
}
