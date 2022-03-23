package leetcode;

public class ClimbingStairs {

    public int climbStairs(int n) {

        int length = n - 1;
        int one = 1;
        int two = 1;
        int result = 0;

        for (int i = length; i >= 0; i--) {
            if (i == length) {
                result = two;
            } else
                result = one + two;
            two = one;
            one = result;

        }
        return result;
    }

    public static void main(String[] args) {

        ClimbingStairs cs = new ClimbingStairs();


        System.out.println(cs.climbStairs(5));
    }

}
