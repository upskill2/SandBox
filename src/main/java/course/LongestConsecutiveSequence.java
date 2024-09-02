package course;

import java.util.Arrays;

public class LongestConsecutiveSequence {

    public int longestConsecutiveSequence(int[] arr) {
        if (arr.length == 0) return 0;
        if (arr.length == 1) return 1;
        Arrays.sort(arr);
        int res = 1;
        int temp = 1;
        for (int i = 1; i < arr.length; i++) {
            int a1 = arr[i];
            int a0 = arr[i - 1];
            final int diff = a1 - a0;
            if (diff == 1) {
                temp++;
            } else if (diff == 0) {
                continue;
            } else {
                res = Math.max(res, temp);
                temp = 1;
            }
        }

        res = Math.max(res, temp);
        return res;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();
        //System.out.println(lcs.longestConsecutiveSequence(new int[]{14, 1, 8, 4, 0, 13, 6, 9, 2, 7})); // 4
        System.out.println(lcs.longestConsecutiveSequence(new int[]{9, 1, 9, -5, 14, 13, 14, 14})); // 4
        System.out.println();
    }

    abstract class AbstractExample {
        public static void main(String[] args) {
            System.out.println("Main method in abstract class");
        }
    }
}
