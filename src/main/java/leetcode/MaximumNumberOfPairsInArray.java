package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfPairsInArray {

    public int[] numberOfPairs(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            final Integer orDefault = map.getOrDefault(nums[i], 0);
            map.put(nums[i], orDefault+1);
        }

        int pairs = 0;
        int leftover = 0;
        for (int value : map.values()) {
            pairs += value / 2;
            leftover += value - value / 2 * 2;
        }

        res[0]=pairs;
        res[1]=leftover;

        return res;

    }

    public static void main(String[] args) {
        MaximumNumberOfPairsInArray mx = new MaximumNumberOfPairsInArray();
        mx.numberOfPairs(new int[]{1, 3, 2, 1, 3, 2, 2});
    }
}
