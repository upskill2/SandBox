package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class MinimumDifferenceBetweenHighestAndLowestOfKscores {
    Queue<Integer> q = new PriorityQueue<>();

    public int minimumDifference(int[] nums, int k) {

        if (nums.length == 1) {
            return 0;
        }

        Arrays.sort(nums);
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (i >= k - 1) {
                result = Math.min(result, nums[i]-nums[i-(k-1)]);
            }
        }


        return result;
    }

    public int factorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        MinimumDifferenceBetweenHighestAndLowestOfKscores md = new MinimumDifferenceBetweenHighestAndLowestOfKscores();
        int[] nums = {9, 4, 1, 7};
        int k = 2;

        md.minimumDifference(nums, k);
    }

}
