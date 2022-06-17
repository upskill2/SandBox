package leetcode;

import java.util.Iterator;

public class MinimumValueToGetPositiveStepByStepSum {

    public int minStartValue(int[] nums) {

        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int k : nums
        ) {
            sum += k;
            min = Math.min(min, sum);

        }

        int res = (min) > 0 ? 1 : 1-min;

        return res;
    }

    public static void main(String[] args) {
        MinimumValueToGetPositiveStepByStepSum min = new MinimumValueToGetPositiveStepByStepSum();

        int[] nums = {-3, 2, -3, 4, 2};
        int[] nums1 = {1, 2};

        //    min.minStartValue(nums);
        min.minStartValue(nums1);
    }


}
