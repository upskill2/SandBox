package leetcode;

import java.util.Arrays;

class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int[] newArray = new int [2];

        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    newArray[0] = i;
                    newArray[1] = j;

                }
            }

        }

        return newArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TwoSum().twoSum(new int[]{3, 1, 4,6,4}, 8)));
    }

}
