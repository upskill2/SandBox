package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> list = new ArrayList();

        while (left <= right) {
            if (calcDivideNum(left)) {
                list.add(left);
            }
            left++;
        }
        return list;
    }

    public static boolean calcDivideNum(int left) {

        int leftInit = left;
        int temp;
        while (left != 0) {
            temp = left % 10;
            left = left / 10;

            try {
                if (leftInit % temp != 0) {
                    return false;
                }
            } catch (ArithmeticException e) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        new SelfDividingNumbers().selfDividingNumbers(left, right);
    }

}
