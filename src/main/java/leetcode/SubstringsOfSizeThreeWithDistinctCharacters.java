package leetcode;

import java.util.HashSet;
import java.util.Set;

public class SubstringsOfSizeThreeWithDistinctCharacters {
    public int countGoodSubstrings(String s) {

        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            Set<Character> set = new HashSet<>();
            String tempS = s.substring(i, i + 3);

            for (char ch : tempS.toCharArray()) {
                set.add(ch);
            }

            if(set.size()==3){count++;}

        }


        return count;
    }

    public static void main(String[] args) {
        SubstringsOfSizeThreeWithDistinctCharacters chart = new SubstringsOfSizeThreeWithDistinctCharacters();

        String s = "xyzzaz";
        String s1 = "aababcabc";

        chart.countGoodSubstrings(s);
        chart.countGoodSubstrings(s1);

    }
}
