package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class NumberOfGoodPairs {

    public int numIdenticalPairs(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int e : nums
        ) {
            if (map.containsKey(e)) {
                map.put(e, map.get(e) + 1);
            } else {
                map.put(e, 1);
            }

        }

        int count = 0;
        for (Integer value : map.values()
        ) {
            if (value > 1) {
                count += value * (value - 1) / 2;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        NumberOfGoodPairs nm = new NumberOfGoodPairs();

        int[] nums = {1, 2, 3, 1, 1, 3};
        int[] nums1 = {1, 1, 1, 1};


     //   nm.numIdenticalPairs(nums);
        nm.numIdenticalPairs(nums1);
    }
}
