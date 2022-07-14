package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LongestNiceSubstring {

    public String longestNiceSubstring(String s) {

        int size = s.length();
        if (size < 2) {
            return "";
        }
        HashSet<Character> record = new HashSet<>();
        for (char c: s.toCharArray()) {
            record.add(c);
        }
        for (int i = 0; i < size; i++) {
            char c = s.charAt(i);
            if (record.contains(Character.toUpperCase(c)) && record.contains(Character.toLowerCase(c))) {
                continue;
            }
            String s1 = longestNiceSubstring(s.substring(0, i));
            String s2 = longestNiceSubstring(s.substring(i + 1, size));
            return s1.length() >= s2.length() ? s1 : s2;
        }

        return s;



/*        String res = "";

        List<String> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String str = s.substring(i, j + 1);
                if (isNiceString(str)) {
                    list.add(str);
                }
            }
        }

        res = getResultStr(list);
        return res;*/
    }

    private String getResultStr(List<String> lst) {
        String rs = "";

        for (String s : lst) {
            if (s.length() > rs.length()) {
                rs = s;
            }
        }
        return rs;
    }

    private boolean isNiceString(String str) {
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                if (!str.contains(String.valueOf(Character.toLowerCase(ch)))) {
                    return false;
                }
            } else {
                if (!str.contains(String.valueOf(Character.toUpperCase(ch)))) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        LongestNiceSubstring nice = new LongestNiceSubstring();

        String s = "YazaAay";
        String s1 = "Bb";
        String s2 = "c";

        nice.longestNiceSubstring(s);
        nice.longestNiceSubstring(s1);
        nice.longestNiceSubstring(s2);
    }
}
