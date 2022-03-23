package leetcode;

import java.util.Arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;
        int p2 = n - 1;

        int index = nums1.length - 1;

        while (index >= 0) {
            if (p1 < 0) {
                nums1[index] = nums2[p2]; //{0} // {1}
                p2--;
            } else if (p2 < 0) {
                nums1[index] = nums1[p1];
                p1--;
            } else {
                if (nums1[p1] > nums2[p2]) {
                    nums1[index] = nums1[p1];
                    p1--;
                } else {
                    nums1[index] = nums2[p2];
                    p2--;
                }
            }

            index--;
        }
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println("-------------------");


    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        int[] nums3 = {1, 2, 4, 5, 6, 0};
        int[] nums4 = {3};
        int m1 = 5;
        int n1 = 1;

        int[] nums5 = {0};
        int[] nums6 = {1};
        int m2 = 0;
        int n2 = 1;

        int[] nums7 = {4, 5, 6, 0, 0, 0};
        int[] nums8 = {1, 2, 3};
        int m3 = 3;
        int n3 = 3;


        MergeSortedArray msa = new MergeSortedArray();
        //     msa.merge(nums1, m, nums2, n);
        //    msa.merge(nums3, m1, nums4, n1);
        //    msa.merge(nums5, m2, nums6, n2);
        msa.merge(nums7, m3, nums8, n3);

    }

}
