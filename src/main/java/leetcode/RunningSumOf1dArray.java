package leetcode;

public class RunningSumOf1dArray {

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }

        return nums;
    }

    public static void main(String[] args) {
        RunningSumOf1dArray runnn = new RunningSumOf1dArray();

        int[] nums = {1, 2, 3, 4};

        runnn.runningSum(nums);
    }
}
