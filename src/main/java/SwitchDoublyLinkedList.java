public class SwitchDoublyLinkedList {

    public static void main(String[] args) {
        SwitchDoublyLinkedList list = new SwitchDoublyLinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);

        list.swapFirstLast();
        list.printAll();

          System.out.println(list);
    }


    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public SwitchDoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }


    public void swapFirstLast() {
        if (length < 2 || head == null) return;

        Node temp1 = tail;
        Node temp2 = head;

        tail = temp2;
        head = temp1;

        tail.prev = temp1.prev;
        head.next = temp2.next;


        temp1.prev.next = tail;
        temp2.next.prev = head;


        head.prev = null;
        tail.next = null;

    }

    public int getLength() {
        return length;
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
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nDoubly Linked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        SwitchDoublyLinkedList.Node current = head;
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
