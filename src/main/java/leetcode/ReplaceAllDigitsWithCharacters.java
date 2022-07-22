package leetcode;

public class ReplaceAllDigitsWithCharacters {
    public String replaceDigits(String s) { //97-122

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                sb.append(s.charAt(i));
            } else {
                int num = s.charAt(i)-48;
            //    char ch = (char) (s.charAt(i-1)+s.charAt(i)-48);
                sb.append((char) (s.charAt(i-1)+s.charAt(i)-48));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        ReplaceAllDigitsWithCharacters rep = new ReplaceAllDigitsWithCharacters();
        String s = "a1c1e1";
        String s1 = "a1b2c3d4e";

        rep.replaceDigits(s);
        rep.replaceDigits(s1);
    }
}
