package leetcode;

import java.util.Arrays;

public class MissingNumber {

    public int missingNumber(int[] nums) { //0, 1 , 3

        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length) {
            if (i != nums[i]) {
                return i;
            }
            i++;
        }
        return 0;
    }

    public static void main(String[] args) {

        MissingNumber missingNumber = new MissingNumber();

        int[] nums = {3, 0, 1};
        int[] nums1 = {9,6,4,2,3,5,7,0,1};

        System.out.println(missingNumber.missingNumber(nums));
        System.out.println(missingNumber.missingNumber(nums1));


    }

}
