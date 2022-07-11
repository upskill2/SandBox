package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CalculateMoneyInLeetcodeBank {
    public int totalMoney(int n) {

        List<Integer> myList = new ArrayList<>();

        int res = 0;
        int increment = 0;
        int anotherIcr = 0;

        int temp = n / 7;
        for (int i = 1; i < n + 1; i++) {


            anotherIcr = n > 13 ? 9 : 7;

            //13 -8
            //26-9

            if (i > 6 + temp) {
                increment = i / 7 * 6;
            }


            res = i + res - increment;
            myList.add(i - increment);
        }
/*        if (temp > 7) {
            res = res - (temp - 7) * 6; 114/6==19
        }*/

        return res;
    }

    public static void main(String[] args) {
        CalculateMoneyInLeetcodeBank c = new CalculateMoneyInLeetcodeBank();
        int n = 4;
        int n1 = 10;
        int n2 = 20;
        int n3 = 26;
        int n4 = 141;

/*      c.totalMoney(n);
        c.totalMoney(n1);
        c.totalMoney(n2);
        c.totalMoney(n3);*/
        c.totalMoney(n4);
    }
}
