package leetcode;

public class MinimumChangesToMakeAlternatingBinaryString {

    public int minOperations(String s) {

        int one = 0;
        int zero = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                    if(s.charAt(i)!='0'){
                        zero++;
                    } else {
                        one++;
                    }
            } else {
                if(s.charAt(i)!='1'){
                    zero++;
                } else {
                    one++;
                }
            }
        }
        return Math.min(zero,one);
    }

    public static void main(String[] args) {
        MinimumChangesToMakeAlternatingBinaryString mn = new MinimumChangesToMakeAlternatingBinaryString();

        String s = "0100";
        String s1 = "01";
        String s2 = "1111";

        mn.minOperations(s);
        mn.minOperations(s1);
        mn.minOperations(s2);
    }
}
