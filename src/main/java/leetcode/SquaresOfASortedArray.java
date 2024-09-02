package leetcode;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {

        int[] result = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int idx = nums.length - 1;

        while (left<right){
            int leftPow = nums[left] * nums[left];
            int rightPow = nums[right] * nums[right];

            if(leftPow>rightPow){
                result[idx--]= leftPow;
                left++;
            } else {
                result[idx--]= rightPow;
                right--;
            }
        }


        return result;
    }

    public static void main(String[] args) {

        SquaresOfASortedArray sq = new SquaresOfASortedArray();
        sq.sortedSquares(new int[]{-4, -1, 0, 3, 10});
    }

}
