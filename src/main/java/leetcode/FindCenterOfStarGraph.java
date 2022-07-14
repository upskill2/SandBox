package leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindCenterOfStarGraph {

    public int findCenter(int[][] edges) {

        Map<Integer, Integer> map = new HashMap<>();

        int value = edges.length;

        for (int[] edge : edges) {
            int one = edge[0];
            int two = edge[1];

            map.put(one, map.getOrDefault(one, 0) + 1);
            map.put(two, map.getOrDefault(two, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {


        }

        List< Integer> list = map.entrySet()
                .stream()
                .filter(entry -> value == (entry.getValue())).map(Map.Entry::getKey).toList();


        return list.get(0);
    }

    public static void main(String[] args) {
        FindCenterOfStarGraph df = new FindCenterOfStarGraph();

        int[][] edges = {{1, 2}, {2, 3}, {4, 2}};

        df.findCenter(edges);

    }

}
