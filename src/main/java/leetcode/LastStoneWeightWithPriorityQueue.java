package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeightWithPriorityQueue {

    public int lastStoneWeight(int[] stones) {

        Comparator<Integer> myComp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return  o2 - o1;
            }
        };

        PriorityQueue<Integer> pq = new PriorityQueue<>(myComp);

        for (int e: stones
             ) {pq.add(e);

        }

        while(pq.size()>1){

            int a = pq.poll();
            int b = pq.poll();

            if(a==b){
                continue;
            } else pq.add(Math.abs(a-b));
        }

        if(pq.size()==0){return  0;} else return pq.peek();

    }


    public static void main(String[] args) {

        int[] stones = {2, 7, 4, 1, 8, 1};
        int[] stones1 = {1};
        int[] stones2 = {2, 2};

        LastStoneWeightWithPriorityQueue last = new LastStoneWeightWithPriorityQueue();
        last.lastStoneWeight(stones);
        // last.lastStoneWeight(stones1);
        //    last.lastStoneWeight(stones2);

    }
}
