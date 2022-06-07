package leetcode;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {


    public int[] replaceElements(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (i != arr.length - 1) {

                arr[i] = getMaxEl(i, Arrays.copyOfRange(arr,i+1,arr.length));
            } else arr[i] = -1;
        }

        return arr;
    }

    public int getMaxEl(int idx, int[] ars) {

        return Arrays.stream(ars).max().getAsInt();

    }

    public static void main(String[] args) {
        ReplaceElementsWithGreatestElementOnRightSide rplc = new ReplaceElementsWithGreatestElementOnRightSide();

        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] arr1 = {400};

        rplc.replaceElements(arr);
        rplc.replaceElements(arr1);
    }

}
