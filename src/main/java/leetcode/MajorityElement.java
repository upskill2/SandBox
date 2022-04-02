package leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {

        Map<Integer, Integer> myMap = new HashMap();

        for (int n : nums
        ) {
            if (myMap.get(n) == null) {
                myMap.put(n, myMap.getOrDefault(n, 1));
            } else {
                myMap.put(n, myMap.get(n) + 1);
            }
        }


        return myMap.entrySet()
                .stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
    }

    public static void main(String[] args) {
        MajorityElement mj = new MajorityElement();

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        System.out.println(mj.majorityElement(nums));
    }

}
