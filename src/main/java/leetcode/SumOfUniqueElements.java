package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SumOfUniqueElements {

    public int sumOfUnique(int[] nums) {

        int sum = 0;

        Map<Integer, Integer> myMap = new HashMap<>();

        for (int e : nums) {
            myMap.put(e, myMap.getOrDefault(e, 0) + 1);
        }

        Iterator<Map.Entry<Integer, Integer>> it = myMap.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<Integer, Integer> pair = it.next();

            if (pair.getValue()==1) {
                sum += pair.getKey();
            }

        }

        return sum;
    }

    public static void main(String[] args) {
        SumOfUniqueElements s = new SumOfUniqueElements();
        int[] nums = {1, 2, 3, 2};

        s.sumOfUnique(nums);
    }
}
