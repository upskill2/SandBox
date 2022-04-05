package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        Map<Character, Integer> myMap = new HashMap<>();
        Map<Character, Integer> myMap1 = new HashMap<>();
        int i = 0;

        while (i < s.length()) {
            myMap.put(s.charAt(i), myMap.getOrDefault(s.charAt(i), 0) + 1);
            myMap1.put(t.charAt(i), myMap1.getOrDefault(t.charAt(i), 0) + 1);
            i ++;
        }

        return myMap.equals(myMap1);

    }

    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("anagram", "nagaram"));


    }

}
