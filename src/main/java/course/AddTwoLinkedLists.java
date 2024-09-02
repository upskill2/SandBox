package course;

public class AddTwoLinkedLists {
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

    public LinkedList addTwoLinkedLists(LinkedList list1, LinkedList list2) {

        Node head1 = list1.head;
        Node head2 = list2.head;

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while (head1 != null) {
            sb1.append(head1.data);
            head1 = head1.next;
        }
        while (head2 != null) {
            sb2.append(head2.data);
            head2 = head2.next;
        }
        int sum1 = sb1.reverse().toString().isEmpty() ? 0 : Integer.parseInt(sb1.toString());
        int sum2 = sb2.reverse().toString().isEmpty() ? 0 : Integer.parseInt(sb2.toString());
        int sum = sum1 + sum2;
        String sumStr = String.valueOf(sum);
        LinkedList list = new LinkedList();
        Node curNode = list.head;
        for (int i = sumStr.length() - 1; i > -1; i--) {
            final int data = Integer.parseInt(String.valueOf(sumStr.charAt(i)));
            if (i == sumStr.length() - 1) {
                list.head = new Node(data);
                curNode = list.head;
            } else {
                curNode.next = new Node(data);
                curNode = curNode.next;
            }
        }

        return list;
    }


    public static void main(String[] args) {
        AddTwoLinkedLists at = new AddTwoLinkedLists();
        LinkedList list1 = new LinkedList(new Node(3, new Node(2, new Node(1))));
        LinkedList list2 = new LinkedList(new Node(5, new Node(9, new Node(4, new Node(3)))));

        at.addTwoLinkedLists(list1, list2);

    }
}
