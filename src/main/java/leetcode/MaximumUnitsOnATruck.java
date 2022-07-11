package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximumUnitsOnATruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        //Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);


        PriorityQueue<int[]> queue = new PriorityQueue<>((x, y) -> y[1]-x[1]);
        for(int[] boxType: boxTypes) queue.offer(boxType);
        int result = 0;
        while(truckSize > 0 && !queue.isEmpty()) {
            int[] boxType = queue.poll();
            result += Math.min(boxType[0], truckSize) * boxType[1];
            truckSize -= boxType[0];
        }


        Arrays.sort(boxTypes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });

        int res = 0;
        int freeBoxes = boxTypes.length;
        while (truckSize > 0 && freeBoxes != 0) {
            for (int[] boxType : boxTypes) {
                int temp = Math.min(truckSize, boxType[0]);

                truckSize -= temp;
                res += temp * boxType[1];

                freeBoxes--;
            }
        }


        return res;
    }

    public static void main(String[] args) {
        MaximumUnitsOnATruck m = new MaximumUnitsOnATruck();

        int[][] boxTypes = {{1, 3}, {2, 2}, {3, 1}};
        int truckSize = 4;

        int[][] boxTypes1 = {{5, 10}, {2, 5}, {4, 7}, {3, 9}};
        int truckSize1 = 10;


        int[][] boxTypes2 = {{1, 3}, {5, 5}, {2, 5}, {4, 2}, {4, 1}, {3, 1}, {2, 2}, {1, 3}, {2, 5}, {3, 2}};
        int truckSize2 = 35;

        //   m.maximumUnits(boxTypes, truckSize);
        //m.maximumUnits(boxTypes1, truckSize1);
        m.maximumUnits(boxTypes2, truckSize2);
    }
}
