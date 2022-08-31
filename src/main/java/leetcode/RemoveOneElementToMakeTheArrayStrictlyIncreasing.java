package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveOneElementToMakeTheArrayStrictlyIncreasing {

    public boolean canBeIncreasing(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            List<Integer> testList = Arrays.stream(nums).boxed().collect(Collectors.toList());
            testList.remove(i);


            if(checkList(testList)){
                return true;
            }
        }

        return false;

    }

    private boolean checkList(List<Integer> list) {
        if (list.stream().sorted().collect(Collectors.toList()).equals(list)) {

            for (int i = 1; i < list.size(); i++) {
                if (list.get(i - 1) >= list.get(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        RemoveOneElementToMakeTheArrayStrictlyIncreasing re = new RemoveOneElementToMakeTheArrayStrictlyIncreasing();

        int[] nums = {1, 2, 10, 5, 7};

        re.canBeIncreasing(nums);


    }

}
