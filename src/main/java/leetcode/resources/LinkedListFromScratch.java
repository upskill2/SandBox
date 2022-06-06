package leetcode.resources;

public class LinkedListFromScratch {

    public ListNode head;
    public ListNode tail;   //not singly linked


    public void add(int val) {

        if (this.head == null) {
            this.head = new ListNode(val);
            this.tail = new ListNode(val); //not singly linked
        } else {

            ListNode nodeToAdd = new ListNode(val);
            nodeToAdd.next = this.head;
            this.head = nodeToAdd;
        }
    }

    public void show() {

        ListNode node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }


    public class ListNode {

        public int data;
        public ListNode next;

        ListNode() {
        }

        ListNode(int d) {
            this.data = d;
        }

        ListNode(int d, ListNode next) {
            this.data = d;
            this.next = next;
        }

    }


}
