package leetcode;

import org.junit.platform.commons.util.CollectionUtils;

import java.util.*;

public class IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer,Integer> map1 = new HashMap<>();
        for (int k : nums1) {map1.put(k, map1.getOrDefault(k,0)+1);}

        Map<Integer,Integer> map2 = new HashMap<>();
        for (int k : nums2) {map2.put(k, map2.getOrDefault(k,0)+1);}

        Map <Integer,Integer> result = new HashMap(map1);
        result.keySet().retainAll(map2.keySet());

        int[] resultFinal = new int[result.size()];

        int idx = 0;
        for (int k : result.keySet()) {
            resultFinal[idx++] = k;
        }
        System.out.println(Arrays.toString(resultFinal));
        return nums1;

    }

    public static void main(String[] args) {
        IntersectionOfTwoArraysII inter = new IntersectionOfTwoArraysII();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        inter.intersect(nums1,nums2);
    }

}
