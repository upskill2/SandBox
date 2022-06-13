package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Maximum69Number {

    public int maximum69Number(int num) {

        ArrayList<Integer> myArray = new ArrayList();

        while (num > 0) {

            myArray.add(num % 10);

            num = num / 10;
        }

        boolean isChanged = false;
        int idx2 = (int) Math.pow(10, myArray.size() - 1);
        int sum = 0;
        for (int i = myArray.size() - 1; i > -1; i--) {
            if (myArray.get(i) == 6 && !isChanged) {
                myArray.set(i, 9);
                isChanged = true;
            }
            sum = myArray.get(i) * idx2 + sum;
            idx2 /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Maximum69Number max = new Maximum69Number();

        int num = 9669;
        int num1 = 9996;
        int num2 = 9999;

        max.maximum69Number(num);
        max.maximum69Number(num1);
        max.maximum69Number(num2);
    }
}
