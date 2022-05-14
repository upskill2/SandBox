package leetcode;

public class MonotonicArray {

    public boolean isMonotonic(int[] nums) {

        if(nums.length==1){return true;}

        for (int i = 1; i < nums.length; i++) {
            if (isMonotonicIncresing(nums)) {
                if (nums[i] - nums[i - 1] >=0) {
                    if (i == nums.length - 1) {
                        return true;
                    }
                }else break;
            } else {
                if (nums[i] - nums[i - 1] <=0) {
                    if (i == nums.length - 1) {
                        return true;
                    }
                } else break;
            }
        }

        return false;
    }

    public static boolean isMonotonicIncresing(int[] nums) {
        return nums[0] < nums[nums.length - 1];

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
        int[] nums1 = {1, 3, 2};
        int[] nums2 = {1, 3, 2, 4};

        //   new MonotonicArray().isMonotonic(nums);
        //   new MonotonicArray().isMonotonic(nums1);
        new MonotonicArray().isMonotonic(nums2);
    }

}
