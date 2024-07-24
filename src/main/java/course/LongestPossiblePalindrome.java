package course;

public class LongestPossiblePalindrome {
    public int longestPalindrome(String str) {
        int[] chars = new int[128];

        for (char ch : str.toCharArray()) {
            int temp = chars[ch] + 1;
            chars[ch] = temp;
        }

        int res = 0;

        for (int i : chars) {
            if (i == 0) continue;
            if (i % 2 == 0) {
                res += i;
            } else {
                res = res + i - 1;
            }

        }

        if(res<str.length()){
            res++;
        }

        return res;
    }

    public static void main(String[] args) {
        LongestPossiblePalindrome pol = new LongestPossiblePalindrome();
        pol.longestPalindrome("abbaba");
    }
}
