package leetcode;

public class MinimumDistanceToTheTargetElement {
    public int getMinDistance(int[] nums, int target, int start) {

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
            res= Math.min(res,Math.abs(i-start));
       //       res  = Math.abs(i-start);
          //     break;
            }
        }


        return res;
    }

    public static void main(String[] args) {
        MinimumDistanceToTheTargetElement el = new MinimumDistanceToTheTargetElement();
        int[] nums = {1, 2, 3, 4, 5};
        int target = 5, start = 3;

        int[] nums1 = {1,1,1,1,1,1,1,1,1,1};
        int target1 = 1, start1 = 9;

      el.getMinDistance(nums,target,start);
      el.getMinDistance(nums1,target1,start1);

    }
}
