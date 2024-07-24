import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] nums) {


        for (int i = 0; i < nums.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < nums.length; j++) {
                final int numJ = nums[j];
                final int numI = nums[minIdx];
                if (numJ < numI) {
                    minIdx = j;
                }
            }
            if (nums[i] > nums[minIdx]) {
                int temp = nums[i];
                int tempMinIdx = nums[minIdx];
                nums[i] = tempMinIdx;
                nums[minIdx] = temp;
            }
        }

    }

    public static void selectionSort_(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void insertionSort(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int prev = i - 1;
            while (prev >= 0 && nums[prev] > curr) {
                nums[prev+1] = nums[prev];
                nums[prev] = curr;
                prev--;

            }
        }

    }

    public static void main(String[] args) {

        int[] myArray = {7, 4, 2, 6, 5, 1, 3};

    //    selectionSort(myArray);

   //     System.out.println(Arrays.toString(myArray));

        insertionSort(myArray);

        System.out.println( Arrays.toString(myArray) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6]

         */

    }


}
