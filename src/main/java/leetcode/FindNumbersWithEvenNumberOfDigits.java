package leetcode;

public class FindNumbersWithEvenNumberOfDigits {

    public int findNumbers(int[] nums) {

        int res = 0;
        for (int el : nums) {
            int temp = 0;
            while (el > 0) {
                temp++;
                el /= 10;
            }
            if (temp % 2 == 0) {
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        FindNumbersWithEvenNumberOfDigits fd = new FindNumbersWithEvenNumberOfDigits();

        int[] nums = {12, 345, 2, 6, 7896};
        int[] nums1 = {555, 901, 482, 1771};

        fd.findNumbers(nums);
        fd.findNumbers(nums1);

    }

}
