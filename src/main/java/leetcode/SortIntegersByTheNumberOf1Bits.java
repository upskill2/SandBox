package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class SortIntegersByTheNumberOf1Bits {

    public int[] sortByBits(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().toList());

        Collections.sort(list, new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (countBits(o1) == countBits(o2)) {
                    return o1 - o2;
                }

                return countBits(o1) - countBits(o2);
            }
        });

        int[] res = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;

    }

    private int countBits(int n) {

        // base case
        if (n == 0)
            return 0;
        else
            return 1 + countBits(n & (n - 1));
    }

    public static void main(String[] args) {

        SortIntegersByTheNumberOf1Bits bit1 = new SortIntegersByTheNumberOf1Bits();

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr1 = {1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};

        bit1.sortByBits(arr);
        bit1.sortByBits(arr1);
    }
}
