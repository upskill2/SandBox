package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheDifference {

    public char findTheDifference(String s, String t) {

        if (s.isEmpty()) {
            return t.charAt(0);
        }

        List<Character> sList = s.chars()
                .mapToObj(e -> (char) e).collect(Collectors.toList());
        Collections.sort(sList);

        List<Character> tList = t.chars()
                .mapToObj(e -> (char) e).collect(Collectors.toList());
        Collections.sort(tList);

        List<Character> list3 = tList.stream()
                .filter(e -> !sList.contains(e))
                .collect(Collectors.toList());

        List<Character> list4 = tList
                .stream()
                .distinct().filter(sList::contains)
                .collect(Collectors.toList());

        List<Character> list5 = new ArrayList(tList);
        list5.removeAll(sList);

        char ch = ' ';

        for (int i = 0; i < sList.size(); i++) {
            if (sList.get(i) != tList.get(i)) {
                return tList.get(i);

            }
        }

        return tList.get(tList.size() - 1);
    }


    public static void main(String[] args) {
        FindTheDifference fd = new FindTheDifference();

        String s = "dabc";
        String t = "abcde";

        String s1 = "a";
        String t1 = "aa";

        String s2 = "";
        String t2 = "y";

          fd.findTheDifference(s, t);
            fd.findTheDifference(s1, t1);
        fd.findTheDifference(s2, t2);
    }

}
