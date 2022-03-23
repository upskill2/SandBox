package w3resource;

import java.util.*;

public class Maximum {

    public Integer maximum(Integer[] list) {

    list = new Integer[]{0, 4,11, 7, 9, 2, 5};

     List<Integer> newlist = new ArrayList<>();
     Collections.addAll(newlist,list);

    return Collections.max(newlist);
    }

    public static void main(String[] args) {
        System.out.println( new Maximum().maximum(new Integer[0]));
    }
}
