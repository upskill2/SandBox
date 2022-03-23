package leetcode;

import java.util.Arrays;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {


        System.out.println(Arrays.toString(nums));

        int elementToBeKeptIndex = 0;
        int temp;

        for (int i = 0; i < nums.length; i++) { //{3,2,2,3} //val=3
            if(nums[i]!=val){
            temp=nums[elementToBeKeptIndex];
            nums[elementToBeKeptIndex]=nums[i];
            nums[i]=temp;
            elementToBeKeptIndex++;

            }
        }

        System.out.println("Updated array is " + Arrays.toString(nums));

        return elementToBeKeptIndex;
    }

    public static void main(String[] args) {
        int [] nums = {3,2,2,3};
        int val = 3;

        System.out.println(new RemoveElement().removeElement(nums,val));

    }
}
