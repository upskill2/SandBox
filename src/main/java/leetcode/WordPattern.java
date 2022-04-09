package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {

        Map<String, String> mapS = new HashMap<>();
        Map<String, String> mapP = new HashMap<>();

        String[] words = s.split("\\W"); //abba  // dog dog dog dog
        int i = 0;
        int j = 0;


        if(pattern.length()!=words.length){
            return false;
        }

        while (i < pattern.length()) {

            String letter = String.valueOf(pattern.charAt(i));

            if (mapS.isEmpty()) {
                mapS.put(letter, words[i]);
            } else if (mapS.get(letter) == null || mapS.get(letter).equals(words[i]) ) {
                mapS.put(letter, words[i]);
            } else return false;
            i++;
        }

        while (j < pattern.length()) {

            String letter = String.valueOf(pattern.charAt(j));

            if (mapP.isEmpty()) {
                mapP.put(words[j],letter);
            } else if (mapP.get(words[j]) == null || mapP.get(words[j]).equals(letter) ) {
                mapP.put(words[j],letter);
            } else return false;
            j++;
        }

        return true;
    }

    public static void main(String[] args) {
        WordPattern wp = new WordPattern();

        String pattern = "abba";
        String s = "dog cat cat fish";
        String s2 = "dog cat cat dog";
        String s3 = "dog dog dog dog";


        System.out.println(wp.wordPattern(pattern, s));
       System.out.println(wp.wordPattern(pattern, s2));
        System.out.println(wp.wordPattern(pattern, s3));
    }

}
