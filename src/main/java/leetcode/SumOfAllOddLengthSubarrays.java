package leetcode;

public class SumOfAllOddLengthSubarrays {

    public int sumOddLengthSubarrays(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if ((j - i + 1) % 2 != 0) {
                    sum += sumElements(i, j, arr);
                }
            }
        }


        return sum;
    }

    private int sumElements(int idxS, int idxE, int[] arr) {
        int res = 0;

        for (int i = idxS; i < idxE + 1; i++) {
            res += arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        SumOfAllOddLengthSubarrays sm = new SumOfAllOddLengthSubarrays();

        int[] arr = {1, 4, 2, 5, 3};
        int[] arr1 = {1, 2};
        int[] arr2 = {10, 11, 12};

        sm.sumOddLengthSubarrays(arr);
        sm.sumOddLengthSubarrays(arr1);
        sm.sumOddLengthSubarrays(arr2);
    }
}
