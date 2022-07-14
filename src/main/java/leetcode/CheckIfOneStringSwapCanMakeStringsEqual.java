package leetcode;

import java.util.Arrays;

public class CheckIfOneStringSwapCanMakeStringsEqual {
    public boolean areAlmostEqual(String s1, String s2) {


        String[] s1Ar = s1.split("(?!^)");
        String[] s2Ar = s2.split("(?!^)");

        Arrays.sort(s1Ar);
        Arrays.sort(s2Ar);

        if(   !Arrays.equals(s1Ar,s2Ar)){
            return false;
        }

        int count = 0;
        for (int i = 0; i < s1.length(); i++) {

           if (s1.charAt(i) != s2.charAt(i)) {
                count++;
            }
        }

        return count < 3;
    }

    public static void main(String[] args) {
        CheckIfOneStringSwapCanMakeStringsEqual s = new CheckIfOneStringSwapCanMakeStringsEqual();

        String s1 = "bank", s2 = "kanb";

        s.areAlmostEqual(s1, s2);
    }
}
