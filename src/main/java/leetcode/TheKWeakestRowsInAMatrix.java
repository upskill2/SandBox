package leetcode;

import java.util.*;
import java.util.stream.Stream;

//sort 2d array https://www.delftstack.com/howto/java/sort-2d-array-java/

public class TheKWeakestRowsInAMatrix {

    public int[] kWeakestRows(int[][] mat, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int count1 = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    count1++;
                }
            }
            map.put(i, count1);
            count1 = 0;
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        int[] res = new int[k];
        int idx = 0;

        for (int i = 0; i < k; i++) {
            res[i]=list.get(i).getKey();
        }


/*        Arrays.sort(res,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                if(a[1]==b[1]){
                    return a[0]-b[0];
                }
                return a[1]-b[1];
            }
        });*/


/*        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        list.forEach(e -> sortedMap.put(e.getKey(), e.getValue()));*/


        //   map.entrySet().stream().sorted(Map.Entry.comparingByValue());
        //   Stream<Map.Entry<Integer,Integer>> sorted = map.entrySet()                .stream()                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));

/*        for (int i = 0; i < mat.length; i++) {

            Arrays.sort(mat[i]);
        }*/



/*        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()
        ) {
            if (idx < k) {

                res[idx] = entry.getKey();
                idx++;
            } else break;
        }*/


        return res;
    }

    public static void main(String[] args) {
        TheKWeakestRowsInAMatrix weak = new TheKWeakestRowsInAMatrix();

        int[][] mat =

                {{1, 1, 0, 0, 0},
                        {1, 1, 1, 1, 0},
                        {1, 0, 0, 0, 0},
                        {1, 1, 0, 0, 0},
                        {1, 1, 1, 1, 1}};

        int k = 3;

        weak.kWeakestRows(mat, k);

    }

}
