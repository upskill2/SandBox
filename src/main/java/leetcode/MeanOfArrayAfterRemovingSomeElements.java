package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MeanOfArrayAfterRemovingSomeElements {
    public double trimMean(int[] arr) {

        double percent = arr.length * 0.05;
        Arrays.sort(arr);
        double sum = 0;

        for (int i = (int) (percent); i < arr.length - percent; i++) {
            sum += arr[i];
        }

        double res = sum / (arr.length - percent * 2);

        return res;
    }

    public static void main(String[] args) {
        MeanOfArrayAfterRemovingSomeElements mea = new MeanOfArrayAfterRemovingSomeElements();

        int[] arr = {1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
        int[] arr1 = {6, 2, 7, 5, 1, 2, 0, 3, 10, 2, 5, 0, 5, 5, 0, 8, 7, 6, 8, 0};
        int[] arr2 = {6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4};

        mea.trimMean(arr);
        mea.trimMean(arr1);
        mea.trimMean(arr2);

    }
}
