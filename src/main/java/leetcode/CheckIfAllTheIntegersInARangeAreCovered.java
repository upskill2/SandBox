package leetcode;

import java.util.HashSet;
import java.util.Set;

public class CheckIfAllTheIntegersInARangeAreCovered {
    public boolean isCovered(int[][] ranges, int left, int right) {


        Set<Integer> setNums = new HashSet<>();

        for (int[] range : ranges) { //  {{1, 2}, {3, 4}, {5, 6}};  // 2-5
            if (right >= range[0] || left <= range[1]) {

                int num = Math.max(left, range[0]);
                while (num <= Math.min(range[1], right)) {
                    setNums.add(num);
                    num++;

                }

            }

        }

        return setNums.size() == (right - left + 1);

    }

    public static void main(String[] args) {
        CheckIfAllTheIntegersInARangeAreCovered sd = new CheckIfAllTheIntegersInARangeAreCovered();

        int[][] ranges = {{1, 2}, {3, 4}, {5, 6}};
        int left = 2, right = 5;

        int[][] ranges1 = {{1, 50}};
        int left1 = 1, right1 = 50;

        int[][] ranges2 = {{1, 10}, {10, 20}};
        int left2 = 21, right2 = 21;

        int[][] ranges3 = {{25, 42}, {7, 14}, {2, 32}, {25, 28}, {39, 49}, {1, 50}, {29, 45}, {18, 47}};
        int left3 = 15, right3 = 38;

        sd.isCovered(ranges, left, right);
        sd.isCovered(ranges1, left1, right1);
        sd.isCovered(ranges2, left2, right2);
        sd.isCovered(ranges3, left3, right3);


    }
}

