package leetcode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddToArrayFormOfInteger {

    public List<Integer> addToArrayForm(int[] num, int k) {

        ArrayList<Integer> res = new ArrayList<>();

        int n = 0;
        for (int i = num.length - 1; i > -1; i--) {
            n = num[i] % 10 + k % 10;

            if (n < 10) {
                res.add(n);
                k /= 10;
            } else {
                res.add(n % 10);
                k = (k + 10) / 10;
            }
        }

        while (k != 0) {

            res.add(k % 10);
            k /= 10;
        }


        Collections.reverse(res);

        return res;
    }

    public static void main(String[] args) {

        int[] num = {2};
        int k = 7;

        new AddToArrayFormOfInteger().addToArrayForm(num, k);

    }
}
