package leetcode;

public class BuildArrayFromPermutation {

    public int[] buildArray(int[] nums) {

        int[] newTets = new int[nums.length];

        int numCurrent = 0;
        int numToBe = 0;


        for (int i = 0; i < nums.length; i++) {



            numCurrent = nums[i];
            numToBe = nums[nums[i]];

            newTets[i] = nums[nums[i]];

        }

        return nums;
    }

    public static void main(String[] args) {
        BuildArrayFromPermutation mut = new BuildArrayFromPermutation();

        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] nums1 = {5, 0, 1, 2, 3, 4};

        mut.buildArray(nums);
        mut.buildArray(nums1);
    }

}
