package leetcode;

public class ThreeConsecutiveOdds {
    public boolean threeConsecutiveOdds(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            } else {
                if (count > 2) {
                    return true;
                }
                count = 0;
            }

        }

        return count > 3;
    }

    public static void main(String[] args) {
        ThreeConsecutiveOdds th = new ThreeConsecutiveOdds();

        int[] arr = {1, 2, 34, 3, 4, 5, 7, 23, 12};
        int[] arr1 = {1, 1, 1};
        int[] arr2 = {823,384,282,984,218,3,127,227,55,266};

        //    th.threeConsecutiveOdds(arr);
        //th.threeConsecutiveOdds(arr1);
        th.threeConsecutiveOdds(arr2);
    }
}
