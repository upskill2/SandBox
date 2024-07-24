package course;

public class ReverseLinkedList {

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

    public void reverseList(LinkedList list) {
        Node previous = null;
        Node current = list.head;

        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;

            current = next;
        }

        list.head = previous;
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLinkedList r = new ReverseLinkedList();
        LinkedList list = new LinkedList();
        Node node = new Node(5);
        Node node1 = new Node(3);
        Node node2 = new Node(6);
        Node node3 = new Node(4);
        Node node4 = new Node(7);
        list.head = node;
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        r.reverseList(list);
        System.out.println();


    }
}
