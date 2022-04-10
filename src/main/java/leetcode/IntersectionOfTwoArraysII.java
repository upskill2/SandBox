package leetcode;

import org.junit.platform.commons.util.CollectionUtils;

import java.util.*;

public class IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();

        Map<Integer,Integer> map1 = new HashMap<>();
        for (int k : nums1) {map1.put(k, map1.getOrDefault(k,0)+1);}

        Map<Integer,Integer> map2 = new HashMap<>();
        for (int k : nums2) {map2.put(k, map2.getOrDefault(k,0)+1);}

        Map <Integer,Integer> result = new HashMap(map1);
        result.keySet().retainAll(map2.keySet());

        list.addAll(result.keySet());
        list.addAll(result.values());

        int[] resultFinal = list.stream().mapToInt(k->k).toArray();



        System.out.println(Arrays.toString(resultFinal));
        return resultFinal;

    }

    public static void main(String[] args) {
        IntersectionOfTwoArraysII inter = new IntersectionOfTwoArraysII();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};

        //inter.intersect(nums1,nums2);
        inter.intersect(nums3,nums4);
    }

}
