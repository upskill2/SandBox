package leetcode.resources;

import leetcode.ReplaceElementsWithGreatestElementOnRightSide;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSideV2 {

    public int[] replaceElements(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int max =Integer.MIN_VALUE;
            if (i != arr.length - 1) {
                for (int j = i+1; j <arr.length ; j++) {
                    max=Math.max(max,arr[j]);
                }
                arr[i]=max;
            } else arr[i] = -1;
        }

        return arr;
    }



    public static void main(String[] args) {
        ReplaceElementsWithGreatestElementOnRightSideV2 rplc = new ReplaceElementsWithGreatestElementOnRightSideV2();

        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] arr1 = {400};

        rplc.replaceElements(arr);
        rplc.replaceElements(arr1);
    }
}
