package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {

        List<String> resultList = new ArrayList<>();

        int indexStart = 0;


        if (nums.length == 0) {
            return resultList;
        } else

            for (int i = 1; i < nums.length; i++) { //{0,1,2,4,5,7}
                if (((long) nums[i] - (long) nums[i - 1]) > 1) {
                    if ((long) indexStart == i - 1) {
                        resultList.add("" + (long) nums[indexStart]);
                        indexStart = i;
                    } else
                        resultList.add(nums[indexStart] + "->" + nums[i - 1]);
                    indexStart = i;

                }
            }

        if (nums[indexStart] != nums[nums.length - 1]) {

            resultList.add(nums[indexStart] + "->" + nums[nums.length - 1]);
        } else
            resultList.add("" + nums[indexStart]);

        return resultList;
    }

    public static void main(String[] args) {
        SummaryRanges sr = new SummaryRanges();

        int[] nums = {0, 1, 2, 4, 5, 7};
        int[] nums0 = {0, 2, 3, 4, 6, 8, 9};
        int[] nums1 = {8};
        int[] nums2 = {};
        int[] nums3 = {-2147483648, -2147483647, 2147483647};

        System.out.println(sr.summaryRanges(nums));
        System.out.println(sr.summaryRanges(nums0));
        System.out.println(sr.summaryRanges(nums1));
        System.out.println(sr.summaryRanges(nums2));
        System.out.println(sr.summaryRanges(nums3));
    }

}
