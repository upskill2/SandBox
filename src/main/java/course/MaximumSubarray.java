package course;

public class MaximumSubarray {

    public int maximumSubarray(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }

        int max = Integer.MIN_VALUE;

/*        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
              int sum1 = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sum1 +=arr[j];
                sum = Math.max(sum1, sum);
                max = Math.max(max, sum);
            }

        }*/

        int localSum = 0;
        for (int val: arr){
            localSum = Math.max(val, localSum + val);
            max = Math.max(localSum, max);
        }

        return max;
    }

    public static void main(String[] args) {
        MaximumSubarray mx = new MaximumSubarray();
        mx.maximumSubarray(new int[]{-3, -1, -2});
        mx.maximumSubarray(new int[]{2, 3, -6, 4, 2, -8, 3});
    }
}
