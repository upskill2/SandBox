package leetcode.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {


    List<List<Integer>> resultOuterList;

    ArrayList<ArrayList<Object>> a = new ArrayList<>();

    public List<List<Integer>> addInto2DList() {
        resultOuterList = new ArrayList<>();
        resultOuterList.add(new ArrayList<Integer>());

        resultOuterList.get(0).add(0, 5);
        resultOuterList.add(new ArrayList<Integer>());
        resultOuterList.add(new ArrayList<Integer>());
        resultOuterList.get(1).add(0, 99);
        resultOuterList.get(1).add(1, 99);
        resultOuterList.get(2).add(0, 32);
        resultOuterList.get(2).add(1, 32);
        resultOuterList.get(2).add(2, 32);
        resultOuterList.get(2).add(3, 32);
        resultOuterList.get(2).add(4, 32);

        "a".replace("a","b");

        System.out.println(resultOuterList);
        return resultOuterList;

    }

    public static void main(String[] args) {
        new Test().addInto2DList();
    }

}
