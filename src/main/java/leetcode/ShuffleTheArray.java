package leetcode;

public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {

        int[] res = new int[nums.length];

        int left = 0;
        int right = n;

        for (int i = 0; i < nums.length; i += 2) {
            res[i] = nums[left];
            res[i + 1] = nums[right];
            right++;
            left++;

        }

        return res;
    }

    public static void main(String[] args) {
        ShuffleTheArray sh = new ShuffleTheArray();
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] nums1 = {1, 2, 3, 4, 4, 3, 2, 1};
        int n1 = 4;

        sh.shuffle(nums, n);
        sh.shuffle(nums1, n1);
    }
}
