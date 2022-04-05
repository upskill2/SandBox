package leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {

        Map<Character, String> map = new HashMap<>();

        String[] words = s.split("\\W"); //abba  // dog cat cat dog

        int i = 0;
        while (i<pattern.length()) {
            if(map.isEmpty()){
                map.put(pattern.charAt(i),words[i]);
            } else if(map.get(pattern.charAt(i))==words[i]){
                map.put(pattern.charAt(i),words[i]);
            } else return false;
        i++;
        }

        return true;
    }

    public static void main(String[] args) {
        WordPattern wp = new WordPattern();

        String pattern = "abba";
        String s = "dog cat cat dog";

        System.out.println(wp.wordPattern(pattern, s));
    }

}
