package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public int singleNumber(int[] nums) {

        int count = 0;
        int index = 0;
        int validNumber = 0;

        Map<Integer, Integer> map = new HashMap();

        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;

    }

    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();
        int[] nums = {2, 2, 1};
        int[] nums2 = {2, 2, 1, 4, 6, 7, 8, 1, 4, 6, 7};


      //  System.out.println(sn.singleNumber(nums));
        System.out.println(sn.singleNumber(nums2));
    }

}
