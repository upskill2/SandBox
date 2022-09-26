package leetcode;

public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {


        int[] res = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            res[i]=nums[i];
            res[i+ nums.length]=nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
        ConcatenationOfArray conc = new ConcatenationOfArray();

        int[] nums = {1, 2, 1};

        conc.getConcatenation(nums);
    }

}
