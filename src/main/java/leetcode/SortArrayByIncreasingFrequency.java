package leetcode;

import javax.swing.*;
import java.util.*;
import java.util.stream.IntStream;

public class SortArrayByIncreasingFrequency {

    public int[] frequencySort(int[] nums) {

        Map<Integer, Integer> myMap = new HashMap<>();
        List<Integer> resList = new ArrayList<>();

        for (int e : nums) {
            myMap.put(e, myMap.getOrDefault(e, 0) + 1);
            resList.add(e);
        }

        Comparator<Integer> comp = (a, b) -> myMap.get(a) == myMap.get(b) ? b - a : myMap.get(a) - myMap.get(b);

        Collections.sort(resList, comp);

        return resList.stream().mapToInt(k -> k).toArray();
    }


/*    return Arrays.stream(nums) // create a stream of int from the int[] array
            .boxed() // convert int to Integer
				 .sorted((i1, i2) -> map.get(i1).equals(map.get(i2)) ? // if frequencies are same
            Integer.compare(i2, i1) :         // then compare the values for descending order
            Integer.compare(map.get(i1), map.get(i2))) // else compare the frequencies
            .mapToInt(Integer::intValue) // convert Integer to int
				 .toArray(); // collect in an int[] array*/

    public static void main(String[] args) {
        SortArrayByIncreasingFrequency fre = new SortArrayByIncreasingFrequency();

        int[] nums = {1, 1, 2, 2, 2, 3};
        int[] nums1 = {2, 3, 1, 3, 2};
        int[] nums2 = {-1, 1, -6, 4, 5, -6, 1, 4, 1};

        fre.frequencySort(nums);
        fre.frequencySort(nums1);
        fre.frequencySort(nums2);
    }
}
