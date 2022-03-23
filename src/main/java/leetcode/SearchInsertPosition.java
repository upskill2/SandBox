package leetcode;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        int result = 0;

        for (int i = 0; i < nums.length; i++) {  //{1,3,5,6} //target 7
            if (nums[i] == target) {
                result = i;
            } else if (i > 0 && target > nums[i - 1] && target < nums[i]) {
                result = i;
            } else if ( target > nums[nums.length-1]){
                return nums.length;

            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;

        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;

        int[] nums = {1, 3, 5, 6};
        int target = 7;

        System.out.println(new SearchInsertPosition().searchInsert(nums1, target1));
        System.out.println(new SearchInsertPosition().searchInsert(nums2, target2));
        System.out.println(new SearchInsertPosition().searchInsert(nums, target));
    }

}
