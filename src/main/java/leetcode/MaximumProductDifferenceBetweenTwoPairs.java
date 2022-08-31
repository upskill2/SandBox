package leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MaximumProductDifferenceBetweenTwoPairs {

    public int maxProductDifference(int[] nums) {

        Arrays.sort(nums);

        int len = nums.length;
        int res =nums[len-1]*nums[len-2]- nums[0]*nums[1];

        return res;
    }

    public static void main(String[] args) {

        MaximumProductDifferenceBetweenTwoPairs pairs = new MaximumProductDifferenceBetweenTwoPairs();

        int[] nums = {4, 2, 5, 9, 7, 4, 8};


        pairs.maxProductDifference(nums);
    }

}
