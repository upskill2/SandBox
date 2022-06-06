package leetcode;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    public int subtractProductAndSum(int n) {

        int product = 1;
        int sum = 0;

        while (n > 0) {
            int num = n % 10;

            sum += num;
            product *= num;

            n /= 10;
        }

        return product-sum;
    }

    public static void main(String[] args) {

        SubtractTheProductAndSumOfDigitsOfAnInteger m = new SubtractTheProductAndSumOfDigitsOfAnInteger();

        int n = 234;

        m.subtractProductAndSum(n);
    }
}
