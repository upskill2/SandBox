package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RedistributeCharactersToMakeAllStringsEqual {

    public boolean makeEqual(String[] words) {

        int[] temp = new int[26];
        Arrays.stream(words).forEach(word ->{
            for(int i = 0; i < word.length(); i++)
                temp[word.charAt(i) - 'a']++;
        });

        Map<Character, Integer> map = new HashMap<>();

        for (String word : words) {
            for (char ch : word.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        for (Integer entry : map.values()) {
            if (entry % words.length != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        RedistributeCharactersToMakeAllStringsEqual red = new RedistributeCharactersToMakeAllStringsEqual();

        String[] words = {"abc", "aabc", "bc"};
        String[] words1 = {"abbab"};

        red.makeEqual(words);
        red.makeEqual(words1);
    }
}
