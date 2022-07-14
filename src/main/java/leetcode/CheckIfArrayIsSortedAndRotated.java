package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class CheckIfArrayIsSortedAndRotated {

    public boolean check(int[] nums) {

        List<Integer> list = new ArrayList<>(Arrays.stream(nums).boxed().toList());
        List<Integer> listInit = new ArrayList<>(list);

        Collections.sort(list);

        int idx = 0;

        while (idx++ < list.size()) {
            Collections.rotate(list, 1);
            if (Objects.equals(list, listInit)) {
                return true;
            }

        }


        return false;
    }

    public static void main(String[] args) {
        CheckIfArrayIsSortedAndRotated rot = new CheckIfArrayIsSortedAndRotated();
        int[] nums = {3, 4, 5, 1, 2};
        int[] nums1 = {2,1,3,4};

        rot.check(nums);
        rot.check(nums1);

    }

}
