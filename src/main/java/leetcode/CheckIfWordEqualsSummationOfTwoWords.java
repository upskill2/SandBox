package leetcode;

public class CheckIfWordEqualsSummationOfTwoWords {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

        return helper(firstWord)+helper(secondWord)==helper(targetWord);
    }

    private int helper(String word){

       int idx = 1;
       int sumWord = 0;
        for (int i = word.length() - 1; i > -1; i--) {
            sumWord += (word.charAt(i) - 97) * idx;
            idx *= 10;
        }
        return sumWord;
    }

    public static void main(String[] args) {
        CheckIfWordEqualsSummationOfTwoWords cg = new CheckIfWordEqualsSummationOfTwoWords();

        String firstWord = "acb", secondWord = "cba", targetWord = "cdb";

        cg.isSumEqual(firstWord, secondWord, targetWord);


    }

}
