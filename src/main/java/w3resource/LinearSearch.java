package w3resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LinearSearch {

    public static Integer search(Integer n, Integer[] list) {

        list = new Integer[]{0,2,2,3,4,5,6,7,8,11};

        int index = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(n)) {
                index = i;
                break;
            }
        }
        return index;

    }

    public static void main(String[] args) {

     System.out.println((search(11, new Integer [0])));
     // System.out.print(search().toString());

    }
}

