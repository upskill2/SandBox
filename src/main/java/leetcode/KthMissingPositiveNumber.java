package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {

        int count = 0;
        int idx = 0;

        while (count < k) {
            idx++;
            if (Arrays.binarySearch(arr,idx)<0) {
                count++;
            }

        }

        return idx;
    }

    public static void main(String[] args) {
        KthMissingPositiveNumber kth = new KthMissingPositiveNumber();

        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;

        kth.findKthPositive(arr, k);


    }
}
