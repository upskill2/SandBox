package leetcode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {

        List<Integer> arr = Arrays
                .stream(stones)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());



        int res = getStones(arr);

        return res;
    }

    private int getStones(List<Integer> lst){

        while(lst.size()>0){
            if(lst.size()==1){
                return lst.get(0);
            }

            else if(lst.get(0)== lst.get(1)){
                lst.remove(0);
                lst.remove(0);
            } else if(lst.get(0)!= lst.get(1)){
                lst.set(0,lst.get(0)-lst.get(1));
                lst.remove(1);
            }
            lst.sort(Comparator.reverseOrder());
            getStones(lst);
        }
        return 0;
    }

    public static void main(String[] args) {

        int[] stones = {2, 7, 4, 1, 8, 1};
        int[] stones1 = {1};
        int[] stones2 = {2,2};

        LastStoneWeight last = new LastStoneWeight();
        // last.lastStoneWeight(stones);
        // last.lastStoneWeight(stones1);
        last.lastStoneWeight(stones2);

    }

}
