package leetcode;

public class SpecialArrayWithXElementsGreaterThanOrEqualX {

    public int specialArray(int[] nums) {

        int idx = nums.length;
        int count = 0;

        while (idx > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= idx) {
                    count++;
                }
                if (i == nums.length - 1) {
                    if (count == idx) {
                        return count;
                    }
                }
            }
            count=0;
            idx--;
        }

        return -1;
    }

    public static void main(String[] args) {
        SpecialArrayWithXElementsGreaterThanOrEqualX x = new SpecialArrayWithXElementsGreaterThanOrEqualX();

        int[] nums = {3, 5};
        int[] nums1 = {0, 0};
        int[] nums2 = {0, 4, 3, 0, 4};


    //    x.specialArray(nums);
   //     x.specialArray(nums1);
        x.specialArray(nums2);
    }
}
