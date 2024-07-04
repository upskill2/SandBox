package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 1) {
            return strs[0];
        }

        Arrays.sort(strs, Comparator.comparingInt(String::length));
        String common = "";
        for (int i = 0; i <= strs[0].length(); i++) {
            for (int k = 0; k < strs.length; k++) {
                final String kStr = strs[k].substring(0, i);
                final String iStr = strs[0].substring(0, i);
                if (!kStr.equals(iStr)) {
                    return common;
                } else if (k == strs.length - 1) {
                    common = strs[0].substring(0, i);
                }
            }
        }


        return common;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String[] strs1 = {"dog", "racecar", "car"};
        String[] strs2 = {"a", "ab"};

        LongestCommonPrefix longest = new LongestCommonPrefix();
        System.out.println(longest.longestCommonPrefix(strs));
       System.out.println(longest.longestCommonPrefix(strs1));
        System.out.println(longest.longestCommonPrefix(strs2));
    }

}
