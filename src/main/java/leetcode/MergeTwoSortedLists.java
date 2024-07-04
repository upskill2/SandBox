package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class MergeTwoSortedLists {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null) return list2;
        if(list2 == null) return list1;
        if(list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else{
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }


    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list1_1 = new ListNode(2);
        ListNode list1_2 = new ListNode(4);
        list1.setNext(list1_1);
        list1_1.setNext(list1_2);


        ListNode list2 = new ListNode(1);
        ListNode list2_1 = new ListNode(2);
        ListNode list2_2 = new ListNode(4);
        list2.setNext(list2_1);
        list2_1.setNext(list2_2);


        System.out.println(new MergeTwoSortedLists().mergeTwoLists(list1, list2));

    }
}
