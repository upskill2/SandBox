package leetcode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {
        TreeSet<Integer> treeSet = IntStream.of(nums).boxed().collect(Collectors.toCollection(TreeSet::new));
        if (treeSet.size() < 3) {
            return Collections.max(treeSet);
        }
        return treeSet.stream().toList().get(treeSet.size() - 3);
    }

    public static void main(String[] args) {
        ThirdMaximumNumber obj = new ThirdMaximumNumber();
        int[] nums = {2, 2, 3, 1};
        int[] nums1 = {1, 2147483647, -2147483648};
        //  System.out.println(obj.thirdMax(nums));
        System.out.println(obj.thirdMax(nums1));
    }


}
