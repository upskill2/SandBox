package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class StringMatchingInAnArray {

    public List<String> stringMatching(String[] words) {

        //KMP Algorithm for Pattern Searching https://www.geeksforgeeks.org/kmp-algorithm-for-pattern-searching/
        Set<String> res = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            String pattern = words[i];
            for (int j = 0; j < words.length; j++) {
                String word = words[j];
                if (!Objects.equals(pattern, word)) {
                    int[] lps = new int[pattern.length()];
                    createLpsArray(pattern, lps);
                    int idxW = 0;
                    int idxP = 0;
                    while (idxW < word.length()) {
                        if (pattern.charAt(idxP) == word.charAt(idxW)) {
                            idxP++;
                            idxW++;
                        }
                        if (idxP == pattern.length()) {
                            res.add(pattern);
                            idxP = lps[idxP - 1];
                        } else if (idxW<word.length() && pattern.charAt(idxP) != word.charAt(idxW)) {
                            if (idxP != 0) {
                                idxP = lps[idxP - 1];
                            } else {
                                idxW++;
                            }
                        }

                    }
                }

            }

        }


        return new ArrayList<>(res);
    }

    private void createLpsArray(String pattern, int[] lps) {

        int i = 1;
        int len = 0;
        lps[0] = 0;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {

                if (len != 0) {
                    len = lps[len - 1];

                } else {
                    lps[i] = len;
                    i++;
                }
            }
        }

    }

    public static void main(String[] args) {
        StringMatchingInAnArray mtc = new StringMatchingInAnArray();

        //hehert fgheheryhehert

        String[] words = {"mass", "as", "hero", "superhero"};
        String[] words1 = {"leetcode","et", "code"};
        String[] words2 = {"bue", "blu"};
        String[] words3 = {"leetcoder","leetcode","od","hamlet","am"};
        String[] words0 = {"coadcou", "coadcouc"};

        /*     mtc.stringMatching(words);
     mtc.stringMatching(words1);
     mtc.stringMatching(words2);
        mtc.stringMatching(words0);*/
        mtc.stringMatching(words3);
    }
}
