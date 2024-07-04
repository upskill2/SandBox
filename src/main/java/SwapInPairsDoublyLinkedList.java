public class SwapInPairsDoublyLinkedList {

    public static void main(String[] args) {
        SwapInPairsDoublyLinkedList list = new SwapInPairsDoublyLinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);

        list.swapPairs();
       // System.out.println(list);

        String s = "return super.getMessage()" + "; nested exception is: \n\t" +
                "detail.toString();";

        System.out.println(s);


    }

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public SwapInPairsDoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public void swapPairs() {
        if (length < 2 || head == null) return;


        Node temp = new Node(0);
        temp.next = head;
        Node previousNode = temp;


        while (head != null && head.next != null) {
            Node firstNode = head;
            Node secondNode = head.next;

            previousNode.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            secondNode.prev = previousNode;
            firstNode.prev = secondNode;
            if (firstNode.next != null) {
                firstNode.next.prev = firstNode;
            }

            head = firstNode.next;
            previousNode = firstNode;

        }
        head = temp.next;

    }

    public boolean isPalindrome() {
        if (head == null) return false;
        if (length == 1) return true;

        return true;
    }

    public Node getHead() {
        return head;
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
            newNode.prev = current;
        }
        length++;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        SwapInPairsDoublyLinkedList.Node current = head;
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
