package leetcode;

import java.util.Arrays;

public class SignOfTheProductOfAnArray {

    public int arraySign(int[] nums) {

        int negative = 0;
       int res = 1;

/*        Arrays.sort(nums);

        int k = 0;
        while (k< nums.length && nums[k] <= 0 ) {
            if (nums[k] == 0) {
                return 0;
            }
            k++;
            negative++;
        }*/

        for (int el : nums) {
            if(el<0){
                negative++;
            } else if(el==0){
                return 0;
            }
        }

      res = negative % 2 == 0 ? res : -1;

        return negative % 2 == 0 ? 1 : -1;
    }

    public static void main(String[] args) {
        SignOfTheProductOfAnArray sign = new SignOfTheProductOfAnArray();

        int[] nums = {-1, -2, -3, -4, 3, 2, 1};
        int[] nums1 = {1, 5, 0, 2, -3};
        int[] nums2 = {-1, 1, -1, 1, -1};
        int[] nums3 = {0};
        int[] nums4 = {-5};

/*        sign.arraySign(nums);
        sign.arraySign(nums1);
        sign.arraySign(nums2);
        sign.arraySign(nums3);*/
        sign.arraySign(nums4);
    }
}
