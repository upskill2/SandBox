package leetcode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckIfTheSentenceIsPangram {

    public boolean checkIfPangram(String sentence) {

        Set<Character> set = sentence.chars().mapToObj(c -> (char) c).collect(Collectors.toCollection(HashSet::new));

        return set.size()==26;
    }

    public static void main(String[] args) {
        CheckIfTheSentenceIsPangram pan = new CheckIfTheSentenceIsPangram();

        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        pan.checkIfPangram(sentence);
    }
}
