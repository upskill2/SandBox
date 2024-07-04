package leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class CountSpecialQuadruplets {

    public int countQuadruplets(int[] nums) {

        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                for (int k = j + 1; k < nums.length - 1; k++) {
                    for (int l = k + 1; l < nums.length; l++) {
                        final int numI = nums[i];
                        final int numJ = nums[j];
                        final int numK = nums[k];
                        final int numL = nums[l];
                        if (numI + numJ + numK == numL) {
                            res++;
                        }
                    }

                }

            }

        }

        LinkedList ls = new LinkedList();
        return res;
    }

    public static void main(String[] args) {
        CountSpecialQuadruplets q = new CountSpecialQuadruplets();

        int[] nums = {28, 8, 49, 85, 37, 90, 20, 8};
        System.out.println(q.countQuadruplets(nums));
    }
}
