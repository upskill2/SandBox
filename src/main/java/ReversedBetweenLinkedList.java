

public class ReversedBetweenLinkedList {

    public static void main(String[] args) {
/*        ReversedBetweenLinkedList list4 = new ReversedBetweenLinkedList(1);
        list4.append(2);
        list4.append(3);
        list4.append(4);
        list4.append(5);
        list4.append(6);
        list4.append(7);
        list4.reverseBetween(2, 4);
        System.out.println(list4);

        ReversedBetweenLinkedList list = new ReversedBetweenLinkedList(1);
        list.append(2);
        list.reverseBetween(0, 1);
        System.out.println(list);*/

        ReversedBetweenLinkedList list1 = new ReversedBetweenLinkedList(1);
        list1.append(2);
        list1.append(3);
        list1.reverseBetween(0, 2);
        System.out.println(list1);

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

    public ReversedBetweenLinkedList(int value) {
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

    public void reverseBetween(int m, int n) {
        if (head == null || length == 0) {
            return;
        }

        if (length == 2) {
            Node temp = head;
            head = new Node(temp.next.value);
            head.next = new Node(temp.value);
            return;
        }

        Node curr = head;
        Node firstPart = null;
        Node middlePart = null;
        Node lastPart = null;
        Node tailMiddle = null;
        Node tailFirst = null;

        if (m == 0) {
            Node temp = head.next;
            head = new Node(head.value);
            while (temp != null) {
                final int value = temp.value;
                Node temp3 = new Node(value);
               temp3.next = head;
                head = temp3;

               temp = temp.next;
            }

        } else {
            for (int i = 0; i < length; i++) {
                final int value = curr.value;
                if (i == 0) {
                    firstPart = new Node(value);
                    tailFirst = firstPart;
                    firstPart.next = tailFirst;
                } else if (i < m) {
                    Node temp1 = new Node(value);
                    tailFirst.next = temp1;
                    tailFirst = tailFirst.next;
                } else if (i == m) {
                    middlePart = new Node(value);
                    tailMiddle = middlePart;
                } else if (i <= n) {
                    Node temp1 = new Node(value);
                    temp1.next = middlePart;
                    middlePart = temp1;
                } else if (i == n + 1) {
                    lastPart = curr;
                    tailMiddle.next = lastPart;
                }
                curr = curr.next;

            }
            tailFirst.next = middlePart;
            head = firstPart;
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
        if (length == 0) {
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
        ReversedBetweenLinkedList.Node current = head;
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
