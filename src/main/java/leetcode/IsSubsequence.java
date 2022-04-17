package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {

        List<Character> list = new ArrayList<>();

        int lastIndexOf = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = lastIndexOf; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    list.add(s.charAt(i));
                    lastIndexOf = j + 1;
                    break;
                }
            }
        }

        return list.size() == s.length() ? true : false;
    }

    public static void main(String[] args) {
        IsSubsequence is = new IsSubsequence();

        String s = "aaaaaa";
        String t = "bbaaaa";

        is.isSubsequence(s, t);
    }

}
