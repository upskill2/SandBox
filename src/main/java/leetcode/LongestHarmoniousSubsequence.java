package leetcode;

import java.util.*;
import java.util.function.Predicate;

public class LongestHarmoniousSubsequence {

    public static boolean isValidResult(int diff) {
        return diff == 0;

    }

    public int findLHS(int[] nums) {

        int result = 0;
        int finalResult = 0;

        //   if (Arrays.stream(nums).allMatch(s -> Objects.equals(nums[0], s))) {return 0;}

    //    Set<Integer> mySet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            result = 0;
          //  mySet.clear();
            boolean flag = false;
            for (int j = 0; j < nums.length; j++) {
                int diff = (nums[i] - nums[j]);
                if (diff == 0) {
                    result++;

                }
                if (diff == 1) {
                    result++;
                    flag = true;
                                    }
            }

            if ((flag) && result > finalResult) {
                finalResult = result;
            }
        }
        return finalResult;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int[] nums1 = {1, 1, 1, 1};
        int[] nums2 = {1, 3, 5, 7, 9, 11, 13, 15, 17};
        int[] nums3 = {1, 4, 1, 3, 1, -14, 1, -13};
        new LongestHarmoniousSubsequence().findLHS(nums);
        // new LongestHarmoniousSubsequence().findLHS(nums2);
        //new LongestHarmoniousSubsequence().findLHS(nums3);
        //   new LongestHarmoniousSubsequence().findLHS(nums1);
    }

}
