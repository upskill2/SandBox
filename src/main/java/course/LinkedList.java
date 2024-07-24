package course;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

//   +===================================================+
    //   |                  WRITE YOUR CODE HERE             |
    //   | Description:                                      |
    //   | - Constructor for the LinkedList class.           |
    //   | - Initializes the linked list with a single node. |
    //   |                                                   |
    //   | Parameters:                                       |
    //   | - value: The integer value of the first node in   |
    //   |   the newly created linked list.                  |
    //   |                                                   |
    //   | Behavior:                                         |
    //   | - A new Node is created with the given value.     |
    //   | - This node is set as both the head and tail of   |
    //   |   the list, indicating it is the only node in the |
    //   |   list at creation.                               |
    //   | - The length of the list is initialized to 1.     |
    //   +===================================================+


    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
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

    public void bubbleSort() {
        if (getLength() < 2) return;
        Node sortedUntil = null;

        while (sortedUntil != head.next) {
            Node current = head;
            while (current.next != sortedUntil) {
                if (current.value > current.next.value) {
                    int temp = current.next.value;
                    current.next.value = current.value;
                    current.value = temp;
                }
                current = current.next;

            }
            sortedUntil = current;

        }
    }

    public void selectionSort() {
        if (getLength() < 2) return;

        Node current = head;

        while (current != null) {
            Node smallest = current;
            Node inner = current.next;

            while (inner != null) {
                if (inner.value < smallest.value) {
                    smallest = inner;
                }
                inner = inner.next;
            }
            if (smallest != current) {
                final int small = smallest.value;
                smallest.value = current.value;
                current.value = small;
            }
            current = current.next;
        }
        //   tail = current;
    }

    public void merge(LinkedList otherList) {
        Node otherHead = otherList.getHead();
        Node dummy = new Node(0);
        Node current = dummy;


        while (head != null && otherHead != null) {
            if (head.value < otherHead.value) {
                current.next = head;
                head = head.next;
            } else {
                current.next = otherHead;
                otherHead = otherHead.next;
            }
            current = current.next;
        }


        if (head != null) {
            current.next = head;
        } else {
            current.next = otherHead;
            tail = otherList.getTail();
        }


        head = dummy.next;
        length += otherList.getLength();


    }

    public void insertionSort() {
        if (getLength() < 2) return;

        Node sortedListHead = new Node(head.value);
        Node unsortedListHead = head.next;
        //    head = sortedListHead;

        while (unsortedListHead != null) {
            if (unsortedListHead.value < head.value) {
                int value = head.value;
                head.value = unsortedListHead.value;
                unsortedListHead.value = value;
            } else {
                while (sortedListHead != null) {
                    if (unsortedListHead.value > sortedListHead.value) {
                        Node search = sortedListHead.next;
                        sortedListHead.next = unsortedListHead;
                        unsortedListHead.next = search;
                        break;
                    }

                    sortedListHead = sortedListHead.next;
                }
            }
            unsortedListHead = unsortedListHead.next;

        }

    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node get(int index) {
        if (index < 0 || length == 0 || index > length) {
            return null;
        }

        Node nodeByIndex = head;
        int temp = 0;

        while (temp != index) {
            nodeByIndex = nodeByIndex.next;
            temp++;
        }
        return nodeByIndex;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node removedNode = head;
        removedNode.next = null;

        head = head.next;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }

        return removedNode;
    }


    public boolean set(int index, int value) {
        Node node = get(index);
        Node newNode = new Node(value);
        if (node == null) return false;

        newNode.next = node.next;
        node.next = null;
        node = null;


        return true;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;

        if (index == 0 || length == 1) {
            return true;
        }

        if (index == length - 1) {
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node nodeBefore = get(index - 1);
        newNode.next = nodeBefore.next;
        nodeBefore.next = newNode;

        return true;

    }

    public void prepend(int value) {
        if (length == 0) {
            new LinkedList(value);
        } else {
            Node newHead = new Node(value);
            newHead.next = head;
            head = newHead;
            length++;
        }
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node newTail = head;

        while (temp.next != null) {
            newTail = temp;
            temp = temp.next.next;
        }

        length--;
        if (length == 0) {
            tail = null;
            head = null;
        }

        tail = newTail;
        tail.next = null;

        return temp;

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
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList(9);
        list.append(3);
        list.append(5);
        list.append(4);
        list.append(1);
        //   list.bubbleSort();
        //  list.selectionSort();
        //    list.insertionSort();

        LinkedList l1 = new LinkedList(1);
        l1.append(3);
        l1.append(5);
        l1.append(7);

        LinkedList l2 = new LinkedList(2);
        l2.append(4);
        l2.append(6);
        l2.append(8);
        l2.append(9);

        l1.merge(l2);

        l1.printAll();

        //  list.printAll();
    }

}