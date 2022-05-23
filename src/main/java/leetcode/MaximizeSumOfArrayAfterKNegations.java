package leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MaximizeSumOfArrayAfterKNegations {


    public int largestSumAfterKNegations(int[] nums, int k) {

        while (k > 0) {
            int minValue = Arrays.stream(nums).min().getAsInt(); //https://www.techiedelight.com/find-index-element-array-java/
            int indexOfMin = IntStream.range(0,nums.length)
                    .filter(i-> minValue==nums[i])
                    .findFirst()
                    .orElse(-1);

            nums[indexOfMin] = minValue * (-1);
          k--;
        }

        return IntStream.of(nums).sum();
    }

    public static void main(String[] args) {
/*
        Iterator<Integer> itr = pq.iterator();

        while(itr.hasNext()){
            sum += itr.next();
        }*/


        int[] nums = {3, -1, 0, 2};
        int k = 3;

        new MaximizeSumOfArrayAfterKNegations().largestSumAfterKNegations(nums, k);

    }
}
