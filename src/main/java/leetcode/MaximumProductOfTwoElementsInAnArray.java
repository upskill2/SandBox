package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MaximumProductOfTwoElementsInAnArray {

    public int maxProduct(int[] nums) {


        if (nums.length == 2) return (nums[0] - 1) * (nums[1] - 1);

        int i = nums[0];
        int j = nums[1];
        int diff_temp = 0;
        for (int k = 1; k < nums.length; k++) {
            if (nums[k] - i >= 0) {
                j = i;
                i = nums[k];
            } else {
                diff_temp = nums[k] - j;
                if (diff_temp > 0) {
                    j = nums[k];
                }


            }
        }

        return (i - 1) * (j - 1);
    }

    public static void main(String[] args) {

        MaximumProductOfTwoElementsInAnArray max = new MaximumProductOfTwoElementsInAnArray();

        int[] arr = {3, 4, 5, 2};
        int[] arr1 = {3, 7};
        int[] arr2 = {1, 5, 4, 5};
        int[] arr3 = {10, 2, 5, 2};
        int[] arr4 = {1, 8, 5, 4, 10, 2, 6, 1, 1, 1, 9};
        final int i = max.maxProduct(arr);
        final int i2 = max.maxProduct(arr1);
        final int i3 = max.maxProduct(arr2);
        final int i4 = max.maxProduct(arr3);
        final int i5 = max.maxProduct(arr4);
        System.out.println(i);
        System.out.println(i3);
        System.out.println(i2);
        System.out.println(i4);
        System.out.println(i5);

    }
}
