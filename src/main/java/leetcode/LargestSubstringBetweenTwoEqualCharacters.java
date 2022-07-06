package leetcode;

public class LargestSubstringBetweenTwoEqualCharacters {
    public int maxLengthBetweenEqualCharacters(String s) {

        int res = -1;

        for (int i = 0; i < s.length() - 1; i++) {
            int idx = s.length() - 1;
            while (i < idx) {

                if (s.charAt(i) == s.charAt(idx)) {
                    res = Math.max(idx - i - 1, res);
                        break;
                } else {
                    idx--;
                }
            }

        }

        return res;
    }


    public static void main(String[] args) {
        LargestSubstringBetweenTwoEqualCharacters larg = new LargestSubstringBetweenTwoEqualCharacters();

        String s = "aa";
        String s1 = "abca";
        String s2 = "cbzxy";
        String s3 = "scayofdzca";
        String s4 = "mgntdygtxrvxjnwksqhxuxtrv";

        larg.maxLengthBetweenEqualCharacters(s);
        larg.maxLengthBetweenEqualCharacters(s1);
        larg.maxLengthBetweenEqualCharacters(s2);
       larg.maxLengthBetweenEqualCharacters(s3);
        larg.maxLengthBetweenEqualCharacters(s4);
    }

}
