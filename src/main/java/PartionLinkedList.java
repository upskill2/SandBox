import java.util.HashSet;
import java.util.Set;

public class PartionLinkedList {

    public static void main(String[] args) {
/*        PartionLinkedList list = new PartionLinkedList(3);
        list.append(8);
        list.append(5);
        list.append(10);
        list.append(2);
        list.append(1);
        list.partitionList(5);
        System.out.println(list);

        PartionLinkedList list2 = new PartionLinkedList(1);
        list2.append(4);
        list2.append(3);
        list2.append(2);
        list2.append(5);
        list2.append(2);
        list2.partitionList(3);
        System.out.println(list2);


        PartionLinkedList list3 = new PartionLinkedList(8);
        list3.append(4);
        list3.append(3);
        list3.append(2);
        list3.append(1);
        list3.append(4);
        list3.partitionList(3);
        System.out.println(list3);*/


        PartionLinkedList list4 = new PartionLinkedList(8);
        list4.append(4);
        list4.append(3);
        list4.append(2);
        list4.append(5);
        list4.append(4);
        list4.partitionList(1);
        System.out.println(list4);
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        return sb.toString();
    }

    public PartionLinkedList(int value) {
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

    public void partitionList(int x) {
        if (head == null || length == 1) return;

        Node lessHead = null;
        Node biggerHead = null;
        Node lessTail = null;
        Node biggerTail = null;
        Node temp = head;


        for (int i = 0; i < length; i++) {
            final int value = temp.value;
            if (value < x) {
                if (i == 0) {
                    lessHead = new Node(value);
                    lessTail = lessHead;
                    lessHead.next = lessTail;
                } else {
                    if (lessHead == null) {
                        lessHead = new Node(value);
                        lessTail = lessHead;
                        lessHead.next = lessTail;
                    } else {

                        lessTail.next = new Node(value);
                        lessTail = lessTail.next;
                    }
                }
            } else {
                if (i == 0) {
                    biggerHead = new Node(value);
                    biggerTail = biggerHead;
                } else {
                    if (biggerHead == null) {
                        biggerHead = new Node(value);
                        biggerTail = biggerHead;
                    } else {
                        biggerTail.next = new Node(value);
                        biggerTail = biggerTail.next;
                    }
                }
            }
            temp = temp.next;
        }

        if (lessTail == null) {
            return;
        }
        lessTail.next = biggerHead;
        head = lessHead;


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
}
