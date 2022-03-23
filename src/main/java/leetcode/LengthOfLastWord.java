package leetcode;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {

        int endOfSubstring = 0;
        int startOfSubstring = 0;

        for (int i = s.length()-1; i > -1; i--) {
            if (s.charAt(i)!=' ')  {
                endOfSubstring = i+1;
               break;
            }
        }
        for (int j = endOfSubstring - 1; j > -1; j--) {
            if (s.charAt(j) ==' ') {
                startOfSubstring = j+1;
                break;
            }
        }
        return endOfSubstring - startOfSubstring;

    }

    public static void main(String[] args) {
        String s = "Hello World";
        String s1 = "   fly me   to   the moon  ";
        String s2 = "luffy is still joyboy";
        String s3 = "a";

        LengthOfLastWord l = new LengthOfLastWord();

        System.out.println(l.lengthOfLastWord(s));
        System.out.println(l.lengthOfLastWord(s1));
        System.out.println(l.lengthOfLastWord(s2));
        System.out.println(l.lengthOfLastWord(s3));
    }

}
