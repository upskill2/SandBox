package leetcode;

public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {

        int i = 1;
        int len = s.length();
        while (i <= s.length() / 2) { //a b a b
            String s2 = s.substring(0, i);
            String repeatedStr = s2.repeat(len / i);
            if (s.equals(repeatedStr)) {
                return true;
            }
            i++;
        }

        return false;
    }

    public static void main(String[] args) {
        RepeatedSubstringPattern rp = new RepeatedSubstringPattern();

        String s = "abab";
        rp.repeatedSubstringPattern(s);
    }

}
