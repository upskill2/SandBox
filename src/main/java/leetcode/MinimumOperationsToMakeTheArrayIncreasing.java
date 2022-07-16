package leetcode;

import java.util.Arrays;

public class MinimumOperationsToMakeTheArrayIncreasing {

    public int minOperations(int[] nums) {

//        Arrays.sort(nums);
        int res = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int temp = increaseNumber(nums[i], nums[i - 1]);
                res += temp - nums[i];
                nums[i] = temp;

            }
        }

        return res;
    }

    private int increaseNumber(int current, int previous) {
        if (current > previous) {
            return current;
        }
        return increaseNumber(++current, previous);
    }

    public static void main(String[] args) {
        MinimumOperationsToMakeTheArrayIncreasing mn = new MinimumOperationsToMakeTheArrayIncreasing();

        int[] nums = {1, 1, 1};
        int[] nums1 = {1, 5, 2, 4, 1};
        int[] nums2 = {8};

         mn.minOperations(nums);
        mn.minOperations(nums1);
        mn.minOperations(nums2);
    }

}
