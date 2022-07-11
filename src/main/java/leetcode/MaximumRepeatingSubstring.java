package leetcode;

public class MaximumRepeatingSubstring {
    public int maxRepeating(String sequence, String word) {

        int count = 0;
        int res = 0;
        int i = 0;

        for (int j = 0; j < sequence.length(); j++) {

            res = Math.max(res, count);
            i = j;
            count = 0;
            while (i < sequence.length()) {


                if (sequence.substring(i, Math.min(i + word.length(), sequence.length())).equals(word)) {
                    count++;
                    i = Math.min(i + word.length(), sequence.length());
                } else {
                    break;
                }

            }
        }

        res = Math.max(res, count);

        return res;

    }

    public static void main(String[] args) {
        MaximumRepeatingSubstring ms = new MaximumRepeatingSubstring();

        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba", word = "aaaba";

        //      "aaaba aaab aaaba aaaba aaaba aaaba aaaba"


        ms.maxRepeating(sequence, word);
    }

}
