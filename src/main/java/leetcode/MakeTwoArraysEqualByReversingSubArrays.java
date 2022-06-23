package leetcode;

import java.util.Arrays;

public class MakeTwoArraysEqualByReversingSubArrays {

    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);

    if(Arrays.equals(target, arr)){
        return true;
    }

        return false;
    }

    public static void main(String[] args) {
        MakeTwoArraysEqualByReversingSubArrays are = new MakeTwoArraysEqualByReversingSubArrays();

        int[] target = {1, 2, 3, 4}, arr = {2, 4, 1, 3};

        are.canBeEqual(target,arr);

    }
}
