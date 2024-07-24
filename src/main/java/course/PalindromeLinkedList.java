package course;


import java.util.Queue;
import java.util.Stack;

public class PalindromeLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    static class LinkedList {
        Node head;

        LinkedList() {
            this.head = null;
        }

        LinkedList(Node head) {
            this.head = head;
        }
    }

    public boolean isPalindromeList(LinkedList list) {
/*
        if (list.head.next == null) return true;

        Stack<Integer> s = new Stack<>();

        Node temp1 = list.head;
        while (temp1 != null) {
            s.push(temp1.data);
            temp1= temp1.next;
        }

        Node temp = list.head;
        while (temp != null) {
            final Integer peek = s.peek();
            if (peek == temp.data) {
                s.pop();
            } else {
               return false;
            }
            temp = temp.next;
        }
*//*        if(sameNum){
            return true;
        }*//*

        return s.size() <= 1;*/

        Node head = list.head;
        if (head == null || head.next == null) return true;

        Node slow = head;
        Node fast = head;
        Node prev = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            Node temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;

        }
        if (fast != null)
            slow = slow.next;

        while (prev != null && slow != null) {
            if (prev.data != slow.data) return false;
            prev = prev.next;
            slow = slow.next;
        }
        return true;

    }

    public boolean isPalindromeList_test(LinkedList list){
        Node slow = list.head;
        Node fast = list.head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = reverseList(slow);
        Node head = list.head;
        while(slow != null){
            if(slow.data != head.data) return false;
            slow = slow.next;
            head = head.next;
        }
        return true;
    }

    private static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;

        while(current!=null){
            Node next = current.next;
            current.next = prev;
            prev = current;


           current = next;
        }


        return prev;
    }


    public static void main(String[] args) {
        PalindromeLinkedList r = new PalindromeLinkedList();
        LinkedList list = new LinkedList();
        Node node = new Node(8);
        Node node1 = new Node(2);
        Node node2 = new Node(-6);
        Node node3 = new Node(2);
        Node node4 = new Node(8);
        //   Node node5 = new Node(8);
        list.head = node;
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        //  node4.next = node5;


        r.isPalindromeList(list);
        System.out.println();
    }
}
