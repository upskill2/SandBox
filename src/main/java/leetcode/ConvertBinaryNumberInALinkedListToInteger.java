package leetcode;

import leetcode.resources.SinglyLinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ConvertBinaryNumberInALinkedListToInteger extends SinglyLinkedList {

    public int getDecimalValue(ListNode head) {

        ListNode node = head;
        String binary ="";

        while ( node!= null) {
            binary = binary + node.data;
                node=node.next;
        }

        return Integer.parseInt(binary,2);

    }

    public static void main(String[] args) {

        ConvertBinaryNumberInALinkedListToInteger convert = new ConvertBinaryNumberInALinkedListToInteger();

        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.add(1);
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(4);
        linkedList.removeFirst();


        convert.getDecimalValue(linkedList.head);

    }
}
