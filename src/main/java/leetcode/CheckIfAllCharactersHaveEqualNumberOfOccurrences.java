package leetcode;

import java.util.*;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {

    public boolean areOccurrencesEqual(String s) {

        Map<Character, Integer> myMap = new HashMap<>();

        for (Character ch : s.toCharArray()) {
            myMap.put(ch, myMap.getOrDefault(ch, 0) + 1);
        }

        Iterator values = myMap.values().iterator();
        Set<Integer> mySet = new HashSet<>();

        while (values.hasNext()) {
            mySet.add((Integer) values.next());
        }

        boolean res = mySet.size() == 1;

        Set<Integer> hash1 = new HashSet<Integer>(myMap.values());

        return mySet.size() == 1;

    }

    public static void main(String[] args) {

        CheckIfAllCharactersHaveEqualNumberOfOccurrences ocur = new CheckIfAllCharactersHaveEqualNumberOfOccurrences();

        String s = "abacbc";
        String s1 = "aaabb";

        ocur.areOccurrencesEqual(s);
        ocur.areOccurrencesEqual(s1);

    }

}
