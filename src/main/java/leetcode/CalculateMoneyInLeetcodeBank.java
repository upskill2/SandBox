package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CalculateMoneyInLeetcodeBank {
    public int totalMoney(int n) {

        int res = 0;
        int increment = 1;
        int weeks = 0;
        for (int i = 1; i <= n; i++) {

            res += increment + weeks;
            increment++;

            if (increment > 7) {
                weeks++;
                increment = 1;
            }
            String s = "";

        }

        return res;
    }

    public static void main(String[] args) {
        CalculateMoneyInLeetcodeBank c = new CalculateMoneyInLeetcodeBank();
        int n = 4;
        int n1 = 10;
        int n2 = 20;
        int n3 = 26;
        int n4 = 141;

        System.out.println(c.totalMoney(n));
        System.out.println(c.totalMoney(n1));
        c.totalMoney(n2);
        c.totalMoney(n3);
        c.totalMoney(n4);
    }
}
