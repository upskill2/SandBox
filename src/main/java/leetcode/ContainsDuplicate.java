package leetcode;

import java.util.Arrays;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        int temp;

        for (int i = 0; i < nums.length; i++) {  ///[7,3,1,1,2]
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
            //SORT ARRAY
        for (int i = 0; i < nums.length; i++) {  ///[7,3,1,1,2]
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
      //  System.out.println(Arrays.toString(nums));


        return false;
    }

    public static void main(String[] args) {

        ContainsDuplicate cd = new ContainsDuplicate();

        int[] input = {1, 2, 3, 1};
        int[] input0 = {1, 2, 3, 4};
        int[] input1 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println(cd.containsDuplicate(input));
        System.out.println(cd.containsDuplicate(input0));
        System.out.println(cd.containsDuplicate(input1));


    }

}
