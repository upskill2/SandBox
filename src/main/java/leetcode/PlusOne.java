package leetcode;

import java.util.Arrays;

public class PlusOne {

    class NewArrayLength {

        boolean increaseArrayLength(int[] array, int nineCount) {
            return array.length == nineCount;
        }

        int arrayLength = 0;
        int nine = 9;
        int nineCount = 0;

        public int newArrayLength(int[] array) {
            for (int i = (array.length - 1); i > -1; i--) {
                if (array[i] == nine) {
                    nineCount++;
                }
            }

            if (increaseArrayLength(array, nineCount)) {
                arrayLength = array.length + 1;
            } else arrayLength = array.length;
            return arrayLength;
        }

    }

    public int[] plusOne(int[] digits) {

        NewArrayLength nAL = new NewArrayLength();
        int nal = nAL.newArrayLength(digits);

        int[] newArray = new int[nal];

        if (digits.length != nal) {   //input [8,9,9,9] to be [9,0,0,0]
            newArray[0] = 1;
            System.out.println(Arrays.toString(newArray));
            return newArray;
        }
        for (int i = digits.length - 1; i > -1; i--) {
            int nine = 9;
            if (digits[i] == nine) {
                digits[i] = 0;

            } else if (digits[i] != nine) {
                digits[i]++;
                break;
            }

        }
        System.out.println(Arrays.toString(digits));
        return digits;

    }

    public static void main(String[] args) {

        int[] digits = {1, 2, 3};
        int[] digits1 = {4, 3, 2, 1};
        int[] digits2 = {9, 9, 9};
        int[] digits3 = {8, 9, 9, 9};

        PlusOne po = new PlusOne();
        po.plusOne(digits);
        po.plusOne(digits1);
        po.plusOne(digits2);
        po.plusOne(digits3);
    }

}
