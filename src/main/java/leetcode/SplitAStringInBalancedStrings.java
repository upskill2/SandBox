package leetcode;

public class SplitAStringInBalancedStrings {

    public int balancedStringSplit(String s) {

        int res = 0;
        int countR = 0;
        int countL = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (ch == 'R') {
                countR++;
            } else {
                countL++;
            }
            if (countL == countR) {
                res++;
                countR = 0;
                countL = 0;
            }

        }

        return res;
    }

    public static void main(String[] args) {
        SplitAStringInBalancedStrings spl = new SplitAStringInBalancedStrings();

        String s = "RLRRLLRLRL";
        String s1 = "RLLLLRRRLR";
        String s2 = "LLLLRRRR";

           spl.balancedStringSplit(s);
        spl.balancedStringSplit(s1);
           spl.balancedStringSplit(s2);
    }
}
