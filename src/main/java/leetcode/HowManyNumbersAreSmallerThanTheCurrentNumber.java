package leetcode;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> sortedL = IntStream.of(nums).boxed().sorted().toList();
        int[] res = new int[nums.length];

        for (int i = 0; i < res.length; i++) {
            res[i] = sortedL.indexOf(nums[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        HowManyNumbersAreSmallerThanTheCurrentNumber how = new HowManyNumbersAreSmallerThanTheCurrentNumber();
        int[] nums = {8, 1, 2, 2, 3};
        int[] nums1 = {7,7,7,7};
        System.out.println(how.smallerNumbersThanCurrent(nums));
        System.out.println(how.smallerNumbersThanCurrent(nums1));

    }

}
