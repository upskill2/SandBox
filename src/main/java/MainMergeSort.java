
import java.util.Arrays;

public class MainMergeSort {


    public static int[] merge(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int idx = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                res[idx] = arr1[i];
                i++;
            } else {
                res[idx] = arr2[j];
                j++;
            }
            idx++;
        }

        while (i < arr1.length) {
            res[idx] = arr1[i];
            i++;
            idx++;
        }

        while (j < arr2.length) {
            res[idx] = arr2[j];
            j++;
            idx++;
        }

        return res;
    }

    public static int[] mergeSort(int[] arr) {
        int[] res = new int[arr.length];
        if (arr.length < 1) {
            return arr;
        }
        int middleIdx = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, middleIdx));
        int[] right = mergeSort(Arrays.copyOfRange(arr, middleIdx, arr.length));

        return merge(left, right);
    }

    public static void main(String[] args) {

        int[] array1 = {1, 3, 7, 8};
        int[] array2 = {2, 4, 5, 6};

        int[] originalArray = {3, 1, 4, 2};
        int[] sortedArray = mergeSort(originalArray);

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("\nSorted Array: " + Arrays.toString(sortedArray));
        //    System.out.println(Arrays.toString(merge(array1, array2)));

    }
}
