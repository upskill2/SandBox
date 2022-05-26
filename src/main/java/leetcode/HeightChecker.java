package leetcode;

import java.util.Arrays;
import java.util.Iterator;

public class HeightChecker {

    public int heightChecker(int[] heights) {

        int[] copy = Arrays.copyOf(heights, heights.length);
        Arrays.sort(copy);

        Iterator<Integer> it = Arrays.stream(heights).iterator();

        int res = 0;
        int idx = 0;
        while (it.hasNext()) {
            if ( !it.next().equals(copy[idx])) {
                res++;
            }
            idx++;
        }

        return res;
    }

    public static void main(String[] args) {

        int[] heights = {1, 1, 4, 2, 1, 3};
        int[] heights1 = {5,1,2,3,4};
        HeightChecker hch = new HeightChecker();


    //    hch.heightChecker(heights);
        hch.heightChecker(heights1);
    }

}
