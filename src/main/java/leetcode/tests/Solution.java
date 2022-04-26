package leetcode.tests;

import java.util.*;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        Map<String, Integer> mapFinal = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i] == list2[j]) {
                    mapFinal.put(list1[i], i + j);
                    list.add(i+j);
                    break;
                }
            }
        }

        Collections.sort(list);
        int minValue= list.get(0);

        int listSize=0;
        for (int k : list
        ) {if(k==minValue){
            listSize++;
        }    }

        //int minValue = Collections.min(mapFinal.values());
        //int listSize = Collections.frequency(mapFinal.values(), minValue);
        String[] result = new String[listSize];

        int idx = 0;
        while (idx < listSize) {

            result[idx] = getKeys(mapFinal, minValue).get(idx);
            idx++;
        }


        return result;
    }

    private static List<String> getKeys(Map<String, Integer> mapFinal, int minValue) {
        List<String> result1 = new ArrayList<>();
        if (mapFinal.containsValue(minValue)) {
            for (Map.Entry entry : mapFinal.entrySet()
            ) {
                if (Objects.equals(entry.getValue(), minValue)) {
                    result1.add((String) entry.getKey());
                }

            }
        }
        System.out.println(System.currentTimeMillis());
        return result1;
    }
}
