package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {

        List <List<Integer>> myList = new ArrayList();
        int size = rowIndex+1;

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
            System.out.println(myList.get(rowIndex).toString());
                    }
        catch (Exception e) {
            System.out.println("ERROR " + e);
        }
        return myList.get(rowIndex);

    }

    public static void main(String[] args) {
        PascalsTriangleII pt = new PascalsTriangleII();

        pt.getRow(3);


    }

}
