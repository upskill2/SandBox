package leetcode;

public class ImplementStrStr {

    public int strStr(String haystack, String needle) {

        int result;
        if (needle.isEmpty()) {
            result = 0;

        } else result = haystack.indexOf(needle);

        return result;
    }

    public static void main(String[] args) {
        String haystack = "aaa";
        String needle = "a";
        System.out.println(new ImplementStrStr().strStr(haystack, needle));

        String haystacktwo = "hello";
        String needletwo = "ll";
        System.out.println(new ImplementStrStr().strStr(haystacktwo, needletwo));



    }

}
