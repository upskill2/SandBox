package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberWithHashMap {

    public int singleNumber(int[] nums) {


        Map<Integer, Integer> map = new HashMap();

        for (int i : nums
        ) {
            if (map.get(i) == null) {
                map.put(i, map.getOrDefault(i, 1));
            } else {
                map.put(i, map.get(i) + 1);
            }
        }

        for (int mapkey : map.keySet()
        ) {
            int key = mapkey;
            int value = map.get(mapkey);
            System.out.println(key + " " + value);

        }
        return map.entrySet()
                .stream()
                .filter(f -> f
                .getValue() == 1)
                .findFirst()
                .get()
                .getKey();
    }

    public static void main(String[] args) {
        SingleNumberWithHashMap sn = new SingleNumberWithHashMap();
        int[] nums = {2, 2, 1};
        int[] nums2 = {2, 2, 1, 4, 6, 7, 8, 1, 4, 6, 7};


        //    System.out.println(sn.singleNumber(nums));
        System.out.println(sn.singleNumber(nums2));
    }

}
