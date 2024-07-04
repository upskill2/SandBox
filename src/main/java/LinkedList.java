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
        this.head = new Node(0);
        this.length = value;
        this.tail = head;
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

    public void append(int value){
        Node node = new Node(value);
        if(getLength()>0){
            tail.next = node;
            tail = node;
            length++;
        } else {
            head = node;
            tail = node;
        }
    }

    public Node get(int index){
        if(index <0 || length==0 || index > length){
            return null;
        }

        Node nodeByIndex = head;
        int temp = 0;

        while(temp!=index){
            nodeByIndex = nodeByIndex.next;
            temp ++;
        }
        return nodeByIndex;
    }

    public Node removeFirst(){
        if (length==0) return null;
        Node removedNode = head;
        removedNode.next = null;

        head = head.next;
        length--;
        if(length==0){
            head=null;
            tail=null;
        }

        return removedNode;
    }


    public boolean set(int index, int value){
        Node node = get(index);
        Node newNode = new Node(value);
        if(node==null) return false;

        newNode.next = node.next;
        node.next=null;
        node=null;


        return true;
    }

    public boolean insert(int index, int value){
        if(index<0 || index>length) return false;

        if(index==0 || length == 1){
                      return true;
        }

        if(index==length-1){
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node nodeBefore = get(index-1);
        newNode.next =nodeBefore.next;
        nodeBefore.next=newNode;

        return true;

    }

    public void prepend(int value){
        if(length==0) {
            new LinkedList(value);
        } else {
            Node newHead = new Node(value);
            newHead.next = head;
            head = newHead;
            length++;
        }
    }

    public Node removeLast(){
        if(length==0) return null;
        Node temp = head;
        Node newTail = head;

        while(temp.next!=null){
            newTail = temp;
            temp = temp.next.next;
        }

        length--;
        if(length==0){
            tail = null;
            head = null;
        }

        tail = newTail;
        tail.next=null;

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
        LinkedList list = new LinkedList(4);
        list.printAll();
    }

}