package leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SortingTheSentence {
    public String sortSentence(String s) {

        StringBuilder sb = new StringBuilder();

        Map<Integer, String> map = new TreeMap<>();

        for (String str : s.split("\\s")) {
            int idx = Integer.parseInt(str.substring(str.length() - 1));
            String s1 = str.substring(0,str.length() - 1);
            map.put(idx,s1);

        }

        for (String entry : map.values()) {
            sb.append(entry).append("\s");
        }


        String[] splits = s.split(" ");
        Arrays.sort(splits, (a, b)->a.charAt(a.length()-1)-b.charAt(b.length()-1));

        Arrays.stream(s.split(" "))
                .sorted((a,b) -> Integer.compare(a.charAt(a.length()-1), b.charAt(b.length()-1)))
                .map(e -> e.substring(0,e.length()-1))
                .collect(Collectors.joining(" "));

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        SortingTheSentence sor = new SortingTheSentence();

        String s = "is2 sentence4 This1 a3";

        sor.sortSentence(s);
    }

}
