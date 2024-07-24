package course;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FindPair {

    public boolean findPair(int[] arr, int k) {

        Set<Integer> set = new HashSet<>();

        for (int j : arr) {
            int val = k - j;
            if (set.contains(val)) {
                return true;
            } else {
                set.add(j);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        FindPair findPair = new FindPair();
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 10;
        System.out.println(findPair.findPair(arr, k));

    }

}
