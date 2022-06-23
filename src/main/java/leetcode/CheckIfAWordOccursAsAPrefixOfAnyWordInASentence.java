package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {
    public int isPrefixOfWord(String sentence, String searchWord) {

        String[] ar = sentence.split("\\s");
        List<String> res = new ArrayList<>();

        for (int i = 0; i < ar.length; i++) {
            Matcher m = Pattern.compile("^" + searchWord).matcher(ar[i]);

            if (m.find()) {
                res.add(m.group(0));
                res.add(ar[i]);
                return i + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        CheckIfAWordOccursAsAPrefixOfAnyWordInASentence chs = new CheckIfAWordOccursAsAPrefixOfAnyWordInASentence();

        String sentence = "i love eating burger", searchWord = "burg";
        String sentence1 = "this problem is an easy problem", searchWord1 = "pro";
        String sentence2 = "hellohello hellohellohello", searchWord2 = "ell";

        chs.isPrefixOfWord(sentence, searchWord);
        chs.isPrefixOfWord(sentence1, searchWord1);
        chs.isPrefixOfWord(sentence2, searchWord2);
    }
}
