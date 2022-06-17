package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReformatTheString {

    public String reformat(String s) {

        List<Integer> numList = new ArrayList<>();
        List<Character> charList = new ArrayList<>();

        int numCount = 0;
        int charCount = 0;
        StringBuilder res = new StringBuilder();

        for (char ch : s.toCharArray()
        ) {
            if (Character.isDigit(ch)) {
                numList.add((int) ch);
                numCount++;
            } else {
                charList.add(ch);
                charCount++;
            }

        }

        if (numCount - charCount < 0) {
            while (res.length() < s.length()) {
                for (int i = 0; i < charList.size(); i++) {
                    res.append(charList.get(i)).append(numList.get(i));
                }
            }

        } else if (numCount - charCount > 0) {
            while (res.length() < s.length()) {
                for (int i = 0; i < numList.size(); i++) {
                    res.append(numList.get(i)).append(charList.get(i));
                }
            }
        } else {
            res = new StringBuilder(s);
        }

        return res.toString();
    }

    public static void main(String[] args) {
        ReformatTheString ref = new ReformatTheString();

        String s = "a0b1c2";
        String s1 = "leetcode";

    //    ref.reformat(s);
        ref.reformat(s1);
    }
}
