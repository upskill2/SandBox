package leetcode.tests;

public class SinglyLinkedList<T> {

    private int size = 0;

    public SinglyLinkedList.ListNode head;

    public void add(int val) {

        if (this.head == null) {
            this.head = new SinglyLinkedList.ListNode(val);
            size++;
        } else {

            SinglyLinkedList.ListNode nodeToAdd = new SinglyLinkedList.ListNode(val);
            nodeToAdd.next = this.head;
            this.head = nodeToAdd;
            size++;
        }
    }

    public int size(){
        return size;
    }

    public void show() {

        SinglyLinkedList.ListNode node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }


    public class ListNode {

        public int data;
        public SinglyLinkedList.ListNode next;

        ListNode() {
        }

        ListNode(int d) {
            this.data = d;
        }

        ListNode(int d, SinglyLinkedList.ListNode next) {
            this.data = d;
            this.next = next;
        }

    }

}