package course;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Stack;

public class LongestCommonSubsequence {

    static int lcs(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < m+1; j++){
                final char ch1 = str1.charAt(i - 1);
                final char ch2 = str2.charAt(j - 1);
                if(ch1 == ch2)
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[n][m];
    }


    public static void main(String[] args) {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        System.out.println(lcs.lcs("abdacbab", "acebfca")); // 3


            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                list.add(i);
            }

            try {
                list.stream().forEach(e -> {
                    if (e == 5) {
                        list.add(100); // This will cause ConcurrentModificationException
                    }
                    System.out.println(e);
                });
            } catch (ConcurrentModificationException e) {
                System.out.println("Concurrent modification detected: " + e);
            }
    }


}
