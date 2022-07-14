package leetcode;

import java.util.*;

public class CountItemsMatchingARule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        Map<String, Integer> typeM = new HashMap<>();
        Map<String, Integer> colorM = new HashMap<>();
        Map<String, Integer> nameM = new HashMap<>();

        for (List<String> strings : items) {
            for (int j = 0; j < items.get(0).size(); j++) {
                String item = strings.get(j);
                switch (j) {
                    case 0 -> typeM.put(item, typeM.getOrDefault(item, 0) + 1);
                    case 1 -> colorM.put(item, colorM.getOrDefault(item, 0) + 1);
                    case 2 -> nameM.put(item, nameM.getOrDefault(item, 0) + 1);
                }
            }
        }



        return switch (ruleKey) {
            case "type" -> typeM.getOrDefault(ruleValue, 0);
            case "color" -> colorM.getOrDefault(ruleValue, 0);
            //      case "name" -> nameM.get(ruleValue);
            default -> nameM.getOrDefault(ruleValue, 0);
        };

    }

    public static void main(String[] args) {
        CountItemsMatchingARule rl = new CountItemsMatchingARule();

        String[][] items = new String[][]{{
                "phone", "blue", "pixel"}, {"computer", "silver", "lenovo"}, {"phone", "gold", "iphone"}};

        List<List<String>> outer = new ArrayList<>();

        for (String[] st : items) {
            List<String> lst = Arrays.asList(st);
            outer.add(lst);
        }

        String ruleKey = "color", ruleValue = "silver";

        rl.countMatches(outer, ruleKey, ruleValue);
    }
}

