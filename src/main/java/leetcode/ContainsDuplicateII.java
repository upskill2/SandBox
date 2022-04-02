package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap <Integer,Integer> maps = new HashMap<>(nums.length);  //{1, 0, 1, 1}; k=1

        for (int i = 0; i < nums.length; i++) {
            if(maps.containsKey(nums[i]) && (Math.abs(i- maps.get(nums[i]))<=k)){
            return true;
            } else maps.put(nums[i],i );
        }
        return false;
    }

    public static void main(String[] args) {

        ContainsDuplicateII cd2 = new ContainsDuplicateII();
        int[] nums0 = {1, 2, 3, 1};
        int k0 = 3;

        int[] nums1 = {1, 0, 1, 1};
        int k1 = 1;

        int[] nums2 = {1, 2, 3, 1, 2, 3};
        int k2 = 2;

        System.out.println(cd2.containsNearbyDuplicate(nums0, k0));
        System.out.println(cd2.containsNearbyDuplicate(nums1, k1));
        System.out.println(cd2.containsNearbyDuplicate(nums2, k2));
    }

}
