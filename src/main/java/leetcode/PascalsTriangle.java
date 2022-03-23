package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {


        List <List<Integer>> myList = new ArrayList();
        int size = numRows;

        for (int i = 0; i < size; i++) {
            int internalListSize = i;
            myList.add(new ArrayList<Integer>());
            for (int j = 0; j <= internalListSize; j++) {
            if(j==0 || j==i){
                myList.get(i).add(1);
            } else myList.get(i).add(myList.get(i-1).get(j-1)+myList.get(i-1).get(j));                    // myList.get(i).add(j);

            }
        }

        try {
            System.out.println(myList.toString());
            System.out.println(myList.get(4).get(3));
        }
        catch (Exception e) {
            System.out.println("ERROR " + e);
        }
        return myList;
    }

    public static void main(String[] args) {
        PascalsTriangle pt = new PascalsTriangle();

        pt.generate(5);


    }

}
