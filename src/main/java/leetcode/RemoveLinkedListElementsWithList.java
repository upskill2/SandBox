package leetcode;

import javax.sound.midi.Soundbank;
import java.util.LinkedList;

public class RemoveLinkedListElementsWithList {

    public int removeElements(LinkedList list,  int val) {

      LinkedList<Integer> newList = new LinkedList(list);

        for (int i = 0; i < newList.size(); i++) {
            if(newList.get(i)==val){
                newList.remove(i);
            }
        }


        System.out.println(newList);

        return newList.getLast();

    }

    public static void main(String[] args) {

        RemoveLinkedListElementsWithList rlle = new RemoveLinkedListElementsWithList();

        LinkedList<Integer> list = new LinkedList();
        int [] linkedList = {1,2,6,3,4,5,6};
        int data = 6;
        for (int i: linkedList
        ) {list.add(i);
        }


        System.out.println(rlle.removeElements(list,data));

    }

}
