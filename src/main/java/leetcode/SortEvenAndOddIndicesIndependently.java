package leetcode;

import java.util.Arrays;

public class SortEvenAndOddIndicesIndependently {

    public int[] sortEvenOdd(int[] nums) {
        final int length = nums.length;
        int[] result = new int[length];
        final int i1 = length % 2 == 0 ? length / 2 : length / 2 + 1;
        int[] odd = new int[i1];
        int[] even = new int[i1];

        int oddIdx = 0;
        int evenIdx = 0;
        for (int i = 0; i < length; i++) {
            if (i % 2 != 0) {
                odd[oddIdx] = nums[i];
                oddIdx++;
            } else {
                even[evenIdx] = nums[i];
                evenIdx++;
            }
        }

        Arrays.sort(odd);
        Arrays.sort(even);
        oddIdx = odd.length - 1;
        evenIdx = 0;
        for (int i = 0; i < result.length; i++) {
            if (i % 2 != 0) {
                result[i] = odd[oddIdx];
                oddIdx--;
            } else {
                result[i] = even[evenIdx];
                evenIdx++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SortEvenAndOddIndicesIndependently n = new SortEvenAndOddIndicesIndependently();
        int nums[] = {5, 39, 33, 5, 12, 27, 20, 45, 14, 25, 32, 33, 30, 30, 9, 14, 44, 15, 21};
        int nums1[] = {2,1};
        //n.sortEvenOdd(nums);
        n.sortEvenOdd(nums1);

    }


}
