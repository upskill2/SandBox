package leetcode;

import org.junit.jupiter.api.ClassOrderer;

import java.util.*;
import java.util.stream.Collectors;

public class KthLargest {


    public int[] nums;
    public int k;
    public List<Integer> list;

    public KthLargest(int k, int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        this.nums = nums;
        this.k = k;
        this.list=list;
    }
    public int add(int val) {

            list.add(val);
            list.sort(Comparator.reverseOrder());
            int result = (int) list.get(k-1);

        return result;
    }

    public static void main(String[] args) {

        int k = 3;
        int[] nums = {4, 5, 8, 2};

        KthLargest kth = new KthLargest(k, nums);
        kth.add(3);
        kth.add(5);
        kth.add(10);
        kth.add(9);
        kth.add(4);

    }

}
