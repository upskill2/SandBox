package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HappyNumber {

    public boolean isHappy(int n) {

        Set<Integer> set = new TreeSet<>();

        while (true) {

            int val = 0;
            while (n > 0) {
                //    System.out.println(n % 10);
                val += (int) Math.pow(n % 10, 2);
                n = n / 10;
            }
            if (val == 1) {
                return true;
            } else if (set.contains(val)) {
                return false;
            }
            set.add(val);
            n = val;

        }
    }

    public static void main(String[] args) {
        HappyNumber hn = new HappyNumber();
        int n = 19;
        int n1 = 2;

        System.out.println(hn.isHappy(n));
        System.out.println(hn.isHappy(n1));
    }

}
