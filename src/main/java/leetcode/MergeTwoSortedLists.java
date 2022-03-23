package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class MergeTwoSortedLists {

        public LinkedList mergeTwoLists(LinkedList list1, LinkedList list2) {

        LinkedList list3 = new LinkedList();
        list3.addAll(list1);
        list3.addAll(list2);

        Collections.sort(list3);
            System.out.println(list3.getFirst());

            return list3;
        }

    public static void main(String[] args) {

        LinkedList<Integer> list1=new LinkedList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(4);

        LinkedList<Integer> list2=new LinkedList<Integer>();
        list2.add(1);
        list2.add(3);
        list2.add(4);

        System.out.println(new MergeTwoSortedLists().mergeTwoLists(list1,list2));

    }
}
