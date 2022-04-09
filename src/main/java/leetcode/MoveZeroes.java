package leetcode;

import java.util.Arrays;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        int len = nums.length;
        int indexNotZero = 0;

        for (int i = 0; i < len; i++) { //0, 1, 0, 3, 12
            if (nums[i] != 0) {
                nums[indexNotZero] = nums[i];
                if (indexNotZero < i) {
                    nums[i] = 0;
                }
                indexNotZero = indexNotZero + 1;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {

        MoveZeroes mz = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        int[] nums1 = {1};
        int[] nums2 = {1, 0};

        mz.moveZeroes(nums);
        mz.moveZeroes(nums1);
        mz.moveZeroes(nums2);


    }

}
