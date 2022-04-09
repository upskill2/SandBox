package leetcode;

public class RangeSumQueryImmutable {
    class NumArray {

        private final int[] nums;

        public NumArray(int[] nums) {
            this.nums = nums;

        }

        public int sumRange(int left, int right) {
         int sum = 0;
            for (int i = left; i <=right ; i++) {
            sum += nums[i];
            }
            return sum;
        }
    }

    public static void main(String[] args) {

        int [] nums = {-2, 0, 3, -5, 2, -1};
        int left = 0;
        int right = 2;

        RangeSumQueryImmutable rm = new RangeSumQueryImmutable();


        RangeSumQueryImmutable.NumArray obj = rm.new NumArray(nums);
        System.out.println(obj.sumRange(left,right));

    }

}
