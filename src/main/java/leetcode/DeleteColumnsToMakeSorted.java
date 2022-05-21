package leetcode;

import java.lang.reflect.Array;
import java.util.*;

public class DeleteColumnsToMakeSorted {

    public int minDeletionSize(String[] strs) {


        Set<Integer> ar = new HashSet<>();

        for (int i = 0; i < strs.length-1; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
               if(strs[i].charAt(j) > strs[i+1].charAt(j)){
                    ar.add(j);
                }
           }
       }

        return ar.size();
    }

    public static void main(String[] args) {

        String[] strs = {"cba", "daf", "ghi"};
        String[] strs0 = {"a", "b"};
        String[] strs1 = {"zyx","wvu","tsr"};

        new DeleteColumnsToMakeSorted().minDeletionSize(strs);
        new DeleteColumnsToMakeSorted().minDeletionSize(strs0);
        new DeleteColumnsToMakeSorted().minDeletionSize(strs1);

    }

}
