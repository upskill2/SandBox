import java.util.HashSet;
import java.util.Set;

public class LinkedRemoveDupes {


    public static void main(String[] args) {
        LinkedRemoveDupes list4 = new LinkedRemoveDupes(1);
        list4.append(2);
        list4.append(3);
        list4.append(2);
        list4.append(1);
        list4.append(3);
        list4.removeDuplicates();
        System.out.println(list4);

        LinkedRemoveDupes list = new LinkedRemoveDupes(1);
        list.append(1);
        list.append(1);

        list.removeDuplicates();
        System.out.println(list);
    }

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedRemoveDupes(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void removeDuplicates() {

        if (head == null || length == 1) {
            return;
        }
        Node curr = head.next;
        Node prev = head;
        Set<Integer> set = new HashSet<>();
        set.add(head.value);
        while (curr != null) {
            if (set.contains(curr.value)) {
                    prev.next = null;
            } else {
                set.add(curr.value);
                prev.next = new Node(curr.value);
                prev = prev.next;

            }
            curr = curr.next;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        LinkedRemoveDupes.Node current = head;
        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        return sb.toString();
    }

}