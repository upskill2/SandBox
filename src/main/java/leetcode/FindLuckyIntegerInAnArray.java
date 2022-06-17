package leetcode;

import java.util.Arrays;

public class FindLuckyIntegerInAnArray {
    public int findLucky(int[] arr) {

        Arrays.sort(arr);

        int res = -1;
        int count = 1;
        for (int i = arr.length - 1; i > 0; i--) {

            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count == arr[i]) {
                    res = count;
                    break;
                }
                count = 1;
            }
        }

        return count == arr[0] ? count : res;
    }

    public static void main(String[] args) {
        FindLuckyIntegerInAnArray inAr = new FindLuckyIntegerInAnArray();

        int[] arr = {4, 4, 1, 2, 2, 3, 3, 3};
        int[] arr1 = {2, 2, 2, 3, 3};
        int[] arr2 = {2, 2, 3, 4};

        inAr.findLucky(arr);
        inAr.findLucky(arr1);
        inAr.findLucky(arr2);

    }
}
