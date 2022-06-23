package leetcode;

public class CheckIfAll1sAreAtLeastLengthKPlacesAway {

    public boolean kLengthApart(int[] nums, int k) {

        int count0 = nums[0] == 0 ? k : 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                count0++;
            } else {

                if (count0 < k) {
                    return false;
                }
                count0 = 0;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        CheckIfAll1sAreAtLeastLengthKPlacesAway chk = new CheckIfAll1sAreAtLeastLengthKPlacesAway();

        int[] nums = {1, 0, 0, 0, 1, 0, 0, 1};
        int k = 2;

        int[] nums1 = {1, 1, 1, 0};
        int k1 = 3;


        int[] nums2 = {1, 0, 0, 0, 1, 0, 0, 1};
        int k2 = 2;

        int[] nums3 = {0, 1, 0, 1};
        int k3 = 1;


        int[] nums4 = {1, 0, 0, 0, 1, 0, 0, 1, 0};
        int k4 = 2;

        int[] nums5 = {1, 0, 0, 1, 0, 1};
        int k5 = 2;

        int[] nums6 = {0, 1, 0, 0, 1, 0, 0, 1};
        int k6 = 2;

        //chk.kLengthApart(nums, k);
        //chk.kLengthApart(nums1, k1);
        //chk.kLengthApart(nums2, k2);
        //chk.kLengthApart(nums3, k3);
        //chk.kLengthApart(nums4, k4);
        //chk.kLengthApart(nums5, k5);
        chk.kLengthApart(nums6, k6);
    }

}
