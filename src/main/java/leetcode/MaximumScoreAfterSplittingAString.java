package leetcode;

public class MaximumScoreAfterSplittingAString {

    public int maxScore(String s) {

        int n = s.length();

        int[] ps0 = new int[n+1]; // presum of 0
        int[] ps1 = new int[n+1]; // presum of 1


        for (int i = 1; i <= n; i++) {
            ps0[i] = ps0[i-1] + (s.charAt(i-1)=='0'? 1 : 0);
            ps1[i] = ps1[i-1] + (s.charAt(i-1)== '1' ? 1:0);
        }

        int res = 0;
        // split into 2 **non-empty** substring
        // X|XXXXX
        // i|
        // ps0[i]-ps[0]
        // ps1[n]-ps[i]
        for (int i = 1; i <= n-1; i++) {
            int sum = ps0[i] + (ps1[n] - ps1[i]);
            res = Math.max(res, sum);
        }

        return res;

    }

    public static void main(String[] args) {
        MaximumScoreAfterSplittingAString maxx = new MaximumScoreAfterSplittingAString();

        String s = "011101";

        maxx.maxScore(s);
    }
}
