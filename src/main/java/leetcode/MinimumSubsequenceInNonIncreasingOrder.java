package leetcode;

import java.util.*;

public class MinimumSubsequenceInNonIncreasingOrder {


    public List<Integer> minSubsequence(int[] nums) {

        List<Integer> listSum = new ArrayList<>();

        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int el : nums
        ) {
            list.add(el);
            sum += el;
        }
        Collections.sort(list, Comparator.reverseOrder());
        int currentSum = 0;

        for (int i = 0; i < list.size(); i++) {
            int elZero = list.get(0);
            currentSum += list.get(i);
            if (i == 0) {
                listSum.add(list.get(i));
                if ((elZero > sum - elZero)) {
                    break;
                }
            } else {
                listSum.add(list.get(i));
                if (currentSum > sum - currentSum) {
                    break;

                }

            }

        }


        return listSum;
    }

/*    private boolean sumIsGraterThenRemainingArray() {

    }*/

    public static void main(String[] args) {
        MinimumSubsequenceInNonIncreasingOrder ord = new MinimumSubsequenceInNonIncreasingOrder();

        int[] nums = {4, 3, 10, 9, 8};
        int[] nums1 = {4, 4, 7, 6, 7};
        int[] nums2 = {6};

        ord.minSubsequence(nums);
        ord.minSubsequence(nums1);
        ord.minSubsequence(nums2);
    }

}
