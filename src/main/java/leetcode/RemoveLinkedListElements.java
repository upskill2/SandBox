package leetcode;

import leetcode.tests.LinkedListFromScratch;

import java.util.NoSuchElementException;

public class RemoveLinkedListElements extends LinkedListFromScratch{

        public boolean isEmpty(){
        return head == null;
    }

        public int getLast(){
        if (head == null) {
            throw new NoSuchElementException();
        }
        ListNode tmp = head;
        while(tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }



    public ListNode removeElements(ListNode head, int val) {

        ListNode prev = null, curr = head;

        while(head != null && head.data == val) head = head.next;

        while(curr != null) {
            if(curr.data == val && prev != null)
                prev.next = curr.next;
            else prev = curr;

            curr = curr.next;
        }

        return head;

    }
    public static void main(String[] args) {

        LinkedListFromScratch llfs = new LinkedListFromScratch();
        int [] linkedList = {1,2,6,3,4,5,6};

        for (int i: linkedList
             ) {llfs.add(i);
        }
    //    llfs.show();

        RemoveLinkedListElements rem = new RemoveLinkedListElements();
        System.out.println(rem.removeElements(null,6));
    }



}
