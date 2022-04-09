package leetcode;

import java.util.ArrayList;
import java.util.List;

public class AddDigits {

    public int addDigits(int num) { //38

        List list = new ArrayList();

        int val = 0;

        while (true) {

            while (num > 0) {
                val += num % 10;
                list.add(val);
                num = num / 10;
            }
            num = val;
            if (val < 10) {
                return val;
            }
            val = 0;
        }

    }

    public static void main(String[] args) {
        AddDigits addDigits = new AddDigits();

        int num = 38;
        int num1 = 0;

        System.out.println(addDigits.addDigits(num));
        System.out.println(addDigits.addDigits(num1));

    }

}
