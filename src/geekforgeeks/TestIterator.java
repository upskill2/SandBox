package geekforgeeks;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestIterator {

    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 11; i++) {
            linkedList.add(i);
        }

        Iterator<Integer> myIterator = linkedList.iterator();
        while (myIterator.hasNext()) {
                int j = myIterator.next();
                if (j % 2 != 0) {

                    myIterator.remove();
                }
            }
        System.out.println(linkedList);
        System.out.println("---------");

        }
    }

