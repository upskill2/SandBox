package course;

public class LinkedListSort {

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

    public void sortList(LinkedList list) {

        final Node head = new Node(list.head.data);
        LinkedList sortedL = new LinkedList(head);
        Node unsorted = list.head;
        Node sorted = sortedL.head;

       /* while (unsorted != null) {
            if (unsorted.data < sorted.data) {
                int val = sorted.data;
                sorted.data = unsorted.data;
                sorted.next = new Node(val);
            }
            else {
                Node temp = sorted;
                while (temp.next != null && unsorted.data > temp.next.data) {
                    temp = temp.next;
                }
                temp.next = new Node(unsorted.data, temp.next);
            }


            unsorted = unsorted.next;


    }*/
        Node i = list.head;
        while(i != null){
            Node j = list.head;
            while(j.next != null){
                if(j.data > j.next.data){
                    int temp = j.data;
                    j.data = j.next.data;
                    j.next.data = temp;
                }
                j = j.next;
            }
            i = i.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListSort l = new LinkedListSort();
        final Node head = new Node(4);
        head.next = new Node(8);
        head.next.next = new Node(1);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(2);

        l.sortList(new LinkedList(head));
        System.out.println();


    }
}
