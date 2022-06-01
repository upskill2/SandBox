package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FindWordsThatCanBeFormedByCharacters {

    public int countCharacters(String[] words, String chars) {

        int result = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < chars.length(); i++) {
            map.put(chars.charAt(i), map.getOrDefault(chars.charAt(i), 0) + 1);
        }

        for (int i = 0; i < words.length; i++) {
            Map<Character, Integer> mapInternal = new HashMap<>();
            for (int j = 0; j < words[i].length(); j++) {
                mapInternal.put(words[i].charAt(j), mapInternal.getOrDefault(words[i].charAt(j), 0) + 1);

                if (j == words[i].length() - 1) {

                    result += compareMaps(map, mapInternal);

                }
            }
        }

        return result;
    }

    private int compareMaps(Map<Character, Integer> charsMap, Map<Character, Integer> wordsMap) {

        int sum = 0;

        for (char key : wordsMap.keySet()
        ) {
            if (!charsMap.containsKey(key) || charsMap.get(key) < (wordsMap.get(key))) {
                return 0;
            } else sum += wordsMap.get(key);

        }
        return sum;
    }

    public static void main(String[] args) {

        FindWordsThatCanBeFormedByCharacters fg = new FindWordsThatCanBeFormedByCharacters();

        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";

        String[] words1 = {"hello", "world", "leetcode"};
        String chars1 = "welldonehoneyr";

        fg.countCharacters(words, chars);
        fg.countCharacters(words1, chars1);

    }

}
