package leetcode;

import java.util.*;

public class MinimumAbsoluteDifference {


    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);

        int minInit = 0;
        int min = findMinimum(arr, minInit);


        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == min) {
                list.add(new ArrayList<Integer>());
                int size = list.size()-1;
                list.get(size).add(0, arr[i]);
                list.get(size).add(1, arr[i + 1]);
            }
        }

        System.out.println(list);
        return list;

    }

    private int findMinimum(int[] array, int min) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] == min) {

                return min;
            }
        }
        min++;

        return findMinimum(array, min);
    }

    public static void main(String[] args) {
        MinimumAbsoluteDifference mins = new MinimumAbsoluteDifference();

        int[] arr = {4, 2, 1, 3};
        int[] arr1 = {5, 100, 2000, 30000};
        int[] arr2 = {1, 3, 6, 10, 15};
        int[] arr3 = {3, 8, -10, 23, 19, -4, -14, 27};

        mins.minimumAbsDifference(arr);
        mins.minimumAbsDifference(arr1);
        mins.minimumAbsDifference(arr2);
        mins.minimumAbsDifference(arr3);
    }
}
