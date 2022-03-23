package leetcode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

       System.out.println("Initial array is " + Arrays.toString(nums));

        int unique_element_index = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] != nums[i]) { //0,0,1,1,1,2,2,3,3,4 // i=9
                unique_element_index++;
                nums[unique_element_index] = nums[i];

            }
        }
        System.out.println("Sorted array  is " + Arrays.toString(nums));

        int [] num = new int [unique_element_index+1];
        for (int j = 0; j <unique_element_index+1; j++) {
            num[j]=nums[j];

        }

        System.out.println("Array with unique ints " + Arrays.toString(num));

        return unique_element_index+1;
    }

    public static void main(String[] args) {

        int [] myNums = new int[] {1,1,2};
        int [] myNumsTwo = new int[] {0,0,1,1,1,2,2,3,3,4};

        System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(myNumsTwo));
        System.out.println();
        System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(myNums));
    }

}
