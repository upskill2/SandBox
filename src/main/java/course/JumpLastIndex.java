package course;

public class JumpLastIndex {

    static boolean canJump(int[] arr) {
        int n = arr.length;
        boolean[] dp = new boolean[n];
        dp[0] = true;
        for (int i = 0; i < n; i++) {
            if (!dp[i]) {
                return false;
            } else if (i + arr[i] >= n - 1) {
                return true;
            } else {
                for (int j = 1; j <= arr[i]; j++)
                    dp[i + j] = true;
            }
        }
        return dp[n - 1];
    }
}
