package leetcode;

public class PowerOfTwowithLoop {

    public boolean isPowerOfTwo(int n) {

        long k = 0;
        long result = 0;


        while (result <= n) {  //16
            result = (long) Math.pow(2, k);
            k++;
            if (result == n) {
                return true;
            }
        } return false;
    }

    public static void main(String[] args) {
        PowerOfTwowithLoop p2 = new PowerOfTwowithLoop();

        int n = 16;
        int n0 = 6;
        int n1 = 2147483647;

        System.out.println(p2.isPowerOfTwo(n));
        System.out.println(p2.isPowerOfTwo(n0));
        System.out.println(p2.isPowerOfTwo(n1));
    }

}
