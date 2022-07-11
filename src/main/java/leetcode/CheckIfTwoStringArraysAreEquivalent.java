package leetcode;

public class CheckIfTwoStringArraysAreEquivalent {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String str1 = String.join("",word1);
        String str2 = String.join("",word2);

        boolean b = str1.equals(str2);


        return b;
    }

    public static void main(String[] args) {
        CheckIfTwoStringArraysAreEquivalent ch = new CheckIfTwoStringArraysAreEquivalent();

        String[] word1 = {"ab", "c"}, word2 = {"a", "bc"};

        ch.arrayStringsAreEqual(word1, word2);

    }

}
