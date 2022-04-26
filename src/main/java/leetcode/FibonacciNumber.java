package leetcode;

public class FibonacciNumber {

    public int fib(int n) {

        int f0 = 0;
        int f1 = 1;
        int fn = 0;
        int temp;

        if (n <= 1) {
            return n;
        } else
            for (int i = 1; i < n; i++) {
                fn = f0 + f1;
                temp = f1;
                f1 = fn;
                f0 = temp;
            }
        return fn;
    }

    public static void main(String[] args) {
        FibonacciNumber fb = new FibonacciNumber();
        int n = 3;

        fb.fib(n);
    }

}
