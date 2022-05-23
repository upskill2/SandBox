package leetcode;

import java.util.stream.IntStream;

public class PartitionArrayIntoThreePartsWithEqualSum {

    public boolean canThreePartsEqualSum(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int sum_part_1 = find_1_Partition(i, arr);
            int[] part_2 = find_2_Partition(i + 1, sum_part_1, arr); // idx=7 ; sum=3

            if (part_2[1] == sum_part_1) {
                int sum_part3 = find_3_Partition(part_2[0] + 1, arr);

                if (sum_part3 == sum_part_1) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int find_1_Partition(int endIdx, int[] nums) {

        int res = 0;
        for (int i = 0; i < endIdx + 1; i++) {
            res += nums[i];
        }
        return res;

    }

    private static int[] find_2_Partition(int start, int sumPart1, int[] nums) {

        int res = 0;
        int[] ars = {-1, -1};

        for (int i = start; i < nums.length - 1; i++) {
            res += nums[i];

            if (res == sumPart1) {
                ars[0] = i;
                ars[1] = res;
                break;
            }

        }
        return ars;
    }

    private static int find_3_Partition(int start, int[] nums) {

        int res = 0;
        for (int i = start; i < nums.length; i++) {
            res += nums[i];
        }

        return res;
    }


    public static void main(String[] args) {

        int[] arr = {0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1};
        int[] arr1 = {0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1};
        int[] arr2 = {3, 3, 6, 5, -2, 2, 5, 1, -9, 4};

        int sum = IntStream.of(arr).reduce(0, (a, b) -> a + b);

        PartitionArrayIntoThreePartsWithEqualSum par = new PartitionArrayIntoThreePartsWithEqualSum();

        par.canThreePartsEqualSum(arr);
        par.canThreePartsEqualSum(arr1);
        par.canThreePartsEqualSum(arr2);
    }

}
