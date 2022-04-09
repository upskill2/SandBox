package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        for (int k : nums1) {
            set1.add(k);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int k : nums2) {
            set2.add(k);
        }

        set1.retainAll(set2);



        int[] result = new int[set1.size()];

        int idx = 0;
        for (int k : set1) {
            result[idx++] = k;
        }

        System.out.println(Arrays.toString(result));
        return result;

    }

    public static void main(String[] args) {
        IntersectionOfTwoArrays itt = new IntersectionOfTwoArrays();

        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        int[] nums3 = {1, 2, 2, 1};
        int[] nums4 = {2, 2};

        int[] nums5 = {1};
        int[] nums6 = {1};

        itt.intersection(nums1, nums2);
        itt.intersection(nums3, nums4);
        itt.intersection(nums5, nums6);
    }

}
