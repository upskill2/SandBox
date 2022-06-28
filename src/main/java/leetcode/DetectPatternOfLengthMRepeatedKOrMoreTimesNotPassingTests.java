package leetcode;

import java.util.*;

public class DetectPatternOfLengthMRepeatedKOrMoreTimesNotPassingTests {
    public boolean containsPattern(int[] arr, int m, int k) {

        Map<List<Integer>, Integer> myMap = new HashMap<>();
        List<List<Integer>> listPreviousInput = new ArrayList<>();

        //fill the map
        fillInTheMap(myMap, m, arr, k, listPreviousInput);

        listPreviousInput.removeIf(List::isEmpty);

        Iterator<Map.Entry<List<Integer>, Integer>> it = myMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<List<Integer>, Integer> entry = it.next();

            if (entry.getValue() >= k) {

            }

        }

        if (listPreviousInput.size() >= k) {
            return true;
        }

        return false;
    }

    private void fillInTheMap(Map<List<Integer>, Integer> map, int len, int[] arr, int freq, List<List<Integer>> listPreviousInput) {

        int lastIndex = 0;

        for (int i = 0; i < arr.length; i += len) {


            int start = arr[i];
            if (i + len - 1 >= arr.length) {
                lastIndex = arr.length - 1;
            } else {
                lastIndex = i + len - 1;
            }
            int end = arr[lastIndex];


            List<Integer> list = new ArrayList<>();
            list.add(start);
            if (len > 1) {
                list.add(end);
            }


            if (i != 0 & !listPreviousInput.isEmpty()) {

                if (listPreviousInput.get(0).equals(list)) {
                    listPreviousInput.add(list);

                } else {
                    listPreviousInput.clear();
                    listPreviousInput.add(list);
                }

            } else {
                listPreviousInput.add(list);
            }

            if (listPreviousInput.size() >= freq) {
                return;
            }


            if (!map.containsKey(list)) {

                map.clear();
                map.put(list, 1);

            } else {
                map.put(list, map.get(list) + 1);
            }
        }

    }

    public static void main(String[] args) {
        DetectPatternOfLengthMRepeatedKOrMoreTimesNotPassingTests det = new DetectPatternOfLengthMRepeatedKOrMoreTimesNotPassingTests();

        int[] arr = {1, 2, 1, 2, 1, 1, 1, 3};
        int m = 2, k = 2;

        int[] arr1 = {1, 2, 3, 1, 2};
        int m1 = 2, k1 = 2;

        int[] arr2 = {2, 2, 1, 2, 2, 1, 1, 1, 2, 1};
        int m2 = 2, k2 = 2;

        int[] arr3 = {1, 2, 4, 4, 4, 4};
        int m3 = 1, k3 = 3;

        int[] arr4 = {1, 2, 2, 2, 2, 1, 2, 2, 1, 2, 1, 1, 3, 1, 1};
        int m4 = 2, k4 = 2;

/*        det.containsPattern(arr, m, k);
        det.containsPattern(arr1, m1, k1);
        det.containsPattern(arr2, m2, k2);*/
        //   det.containsPattern(arr3, m3, k3);
        det.containsPattern(arr4, m4, k4);
    }
}
