package leetcode;

import java.util.*;

public class IncreasingDecreasingString {

    public String sortString(String s) {

///

        StringBuilder answer = new StringBuilder(s.length());
        int[] frequencyTable = new int[26];
        for(char letter: s.toCharArray()) {
            frequencyTable[letter - 'a']++;
        }

///

        StringBuilder sb = new StringBuilder();
        ArrayList<Character> list = new ArrayList<>();

        for (char ch : s.toCharArray()
        ) {
            list.add(ch);
        }
        Collections.sort(list);

        while (sb.length() < s.length()) {

            //step 1
            char firstElement = list.get(0);
            sb.append(firstElement);
            list.remove(list.get(0));

            //step 2-3 Pick the smallest character from s which is greater than the last appended character to the result and append it.
            char previousElement = firstElement;
            boolean needToCheckFromBeginning = true;
            while (needToCheckFromBeginning) {
                needToCheckFromBeginning = false;
                for (int i = 0; i < list.size(); i++) {
                    char currentElement = list.get(i);
                    if (currentElement > previousElement) {
                        needToCheckFromBeginning = true;
                        sb.append(currentElement);
                        list.remove(list.get(i));
                        previousElement = currentElement;
                        break;
                    }
                }
            }

            //step 4

            if (!list.isEmpty()) {
                previousElement = list.get(list.size() - 1);
                sb.append(list.get(list.size() - 1));
                list.remove(list.get(list.size() - 1));
            } else break;


            //step 5-6
            for (int i = list.size() - 1; i > -1; i--) {
                char currentElement = list.get(i);
                if (list.get(i) < previousElement) {
                    sb.append(currentElement);
                    list.remove(list.get(i));
                    previousElement = currentElement;

                }
            }

        }

        return sb.toString();
    }

    public static void main(String[] args) {
        IncreasingDecreasingString incr = new IncreasingDecreasingString();

        String s = "aaaabbbbcccc";
        String s1 = "rat";
        String s2 = "leetcode";

            incr.sortString(s);
            incr.sortString(s1);
        incr.sortString(s2);
    }
}
