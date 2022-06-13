package leetcode;

public class DecryptStringFromAlphabetToIntegerMapping {

    public String freqAlphabets(String s) {

        StringBuilder res = new StringBuilder();

        int idx = s.length() - 1;
        char ell = ' ';

        while (idx > -1) {
            if (s.charAt(idx) == '#') {
                ell = (char) ((char) Integer.parseInt(s.substring(idx - 2, idx)) + 96);
                res.append(ell);
                idx = idx - 3;
            } else {
                ell = (char) (Integer.parseInt(s.substring(idx, idx + 1)) + 96);
                res.append(ell);
                idx--;
            }
        }

        return res.reverse().toString();
    }

    public static void main(String[] args) {
        DecryptStringFromAlphabetToIntegerMapping decr = new DecryptStringFromAlphabetToIntegerMapping();

        String s = "10#11#12";
        String s1 = "1326#";

        decr.freqAlphabets(s);
        decr.freqAlphabets(s1);
    }

}
