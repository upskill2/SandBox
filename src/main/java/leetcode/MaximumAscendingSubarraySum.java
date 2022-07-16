package leetcode;

public class MaximumAscendingSubarraySum {
    public int maxAscendingSum(int[] nums) {

        int max = nums[0];
        int res =  0;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > nums[i - 1]) {
                if (i == nums.length - 1) {
                    res += nums[i] + nums[i - 1];
                } else {
                    res += nums[i - 1];
                }
            } else {
                max = Math.max(max, res + nums[i - 1]);
                res = 0;
            }
        }
 //   int    max1 = Math.max(max, res);
        return Math.max(max, res);
    }

    public static void main(String[] args) {
        MaximumAscendingSubarraySum m = new MaximumAscendingSubarraySum();

        int[] nums = {10, 20, 30, 5, 10, 50};
        int[] nums1 = {10, 20, 30, 40, 50};
        int[] nums2 = {12,17,15,13,10,11,12};
        int[] nums3 = {6};

/*        m.maxAscendingSum(nums);
        m.maxAscendingSum(nums1);
        m.maxAscendingSum(nums2);*/
        m.maxAscendingSum(nums3);
    }
}
