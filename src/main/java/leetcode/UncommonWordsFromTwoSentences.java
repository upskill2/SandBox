package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class UncommonWordsFromTwoSentences {

    public String[] uncommonFromSentences(String s1, String s2) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String s : s1.split("\\s+")
        ) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : s2.split("\\s+")
        ) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry keyValue = (Map.Entry) it.next();
            if (!keyValue.getValue().equals(1)) {
                it.remove();
            }
        }

        List<String> words = new LinkedList<>();
        int idx = 0;

        Iterator it1 = map.entrySet().iterator();
        while (it1.hasNext()) {
            Map.Entry keyValue = (Map.Entry) it1.next();
            words.add(keyValue.getKey().toString());
            idx++;
        }
        return words.toArray(new String[words.size()]);
    }

    public static void main(String[] args) {
        String s1 = "this apple is sweet", s2 = "this apple is sour";

        new UncommonWordsFromTwoSentences().uncommonFromSentences(s1, s2);
    }

}
