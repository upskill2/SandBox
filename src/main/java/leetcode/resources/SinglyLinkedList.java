package leetcode.resources;

public class SinglyLinkedList<T> {

    private int size = 0;

    public ListNode head;

    public void add(int val) {

        if (this.head == null) {
            this.head = new ListNode(val);
            size++;
        } else {

           ListNode nodeToAdd = new ListNode(val);
            nodeToAdd.next = this.head;
            this.head = nodeToAdd;
            size++;
        }
    }

    public int size(){
        return size;
    }

    public void show() {

     ListNode node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void removeFirst(){
        ListNode currentNode = head;

        head = currentNode.next;
        currentNode.next=currentNode.next.next;

        size--;
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