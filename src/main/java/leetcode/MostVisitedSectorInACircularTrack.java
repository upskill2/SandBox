package leetcode;

import java.util.*;
import java.util.stream.Stream;

public class MostVisitedSectorInACircularTrack {
    public List<Integer> mostVisited(int n, int[] rounds) {

        List<Integer> list = new ArrayList<>();

        Map<Integer, Integer> myMap = new HashMap<>();

        for (int i = 1; i < n + 1; i++) {
            myMap.put(i, 0);
        }

        //add into map
        fillInMap(rounds, n, myMap);

        //find max
        int maxValue = Collections.max(myMap.entrySet(), Map.Entry.comparingByValue()).getValue();


        // add into list keys
        for (Map.Entry<Integer,Integer> entry : myMap.entrySet()){
            if(entry.getValue().equals(maxValue)){
                list.add(entry.getKey());
            }
        }


        return list;
    }

    private void fillInMap(int[] arr, int rou, Map<Integer, Integer> map) {

        int idx = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int first = arr[i];
            int second = arr[i + 1];


            //case 1
            if (first > second) {
                idx = i == 0 ? first : first + 1;
                while (idx < rou + 1) {

                    map.put(idx, map.get(idx) + 1);
                    idx++;
                }

                idx = 1;
                while (idx < second + 1) {
                    map.put(idx, map.get(idx) + 1);
                    idx++;
                }
            }

            //case 2
            else if (first < second) {
                idx = i == 0 ? first : first + 1;
                while (idx < second + 1) {
                    map.put(idx, map.get(idx) + 1);
                    idx++;
                }

            }

        }

    }

    public static void main(String[] args) {
        MostVisitedSectorInACircularTrack vis = new MostVisitedSectorInACircularTrack();

        int n = 4;
        int[] rounds = {1, 3, 1, 2};

        int n1 = 2;
        int[] rounds1 = {2, 1, 2, 1, 2, 1, 2, 1, 2};

        int n2 = 7;
        int[] rounds2 = {1, 3, 5, 7};

        int n3 = 3;
        int[] rounds3 = {2,1,2,1,3,2,3,1,2,3,1,3,1,2,3,1,3,2,3,2,1,2,3,1,3};




/*              vis.mostVisited(n, rounds);
        vis.mostVisited(n1, rounds1);
              vis.mostVisited(n2, rounds2);*/
              vis.mostVisited(n3, rounds3);
    }
}
