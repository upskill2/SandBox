public class LinkedMiddle {

    public static void main(String[] args) {
        LinkedMiddle list = new LinkedMiddle(1);
        list.append(2);
        list.append(3);
        list.append(4);

        System.out.println( list.findMiddleNode());
    }

        private Node head;
        private Node tail;

        class Node {
            int value;
            Node next;

            Node(int value) {
                this.value = value;
            }
        }

        public LinkedMiddle(int value) {
            Node newNode = new Node(value);
            head = newNode;
            tail = newNode;
        }

        public Node getHead() {
            return head;
        }

        public Node getTail() {
            return tail;
        }

        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
        }

        public void printAll() {
            if (head == null) {
                System.out.println("Head: null");
                System.out.println("Tail: null");
            } else {
                System.out.println("Head: " + head.value);
                System.out.println("Tail: " + tail.value);
            }
            System.out.println("\nLinked List:");
            if (head == null) {
                System.out.println("empty");
            } else {
                printList();
            }
        }

        public void makeEmpty() {
            head = null;
            tail = null;
        }

    public Node findMiddleNode(){
        if(head==null) return null;

        Node slow = head;
        Node fast = head;

        while(slow.next!=null && fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;

        }
        if(fast.next!=null){
            slow = slow.next;
        }

        return slow;
    }

    public boolean hasLoop(){
        Node slow = head;
        Node fast = head;
        boolean res = false;

        while(slow.next!=null || fast.next.next!=null){
            slow = slow.next;
            fast = slow.next.next;
            if(slow==fast){
                return true;
            }
        }

        return res;

    }

        public void append(int value) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // WRITE FIND MIDDLE NODE METHOD HERE //
        //                                    //
        //                                    //
        //                                    //
        //                                    //
        ////////////////////////////////////////



}
