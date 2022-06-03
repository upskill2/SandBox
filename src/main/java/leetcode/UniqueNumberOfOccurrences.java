package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UniqueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {


        Map<Integer,Integer> map = new HashMap<>();

        for (int e: arr
             ) {map.put(e, map.getOrDefault(e,0)+1);
        }

        Iterator<Map.Entry<Integer,Integer>> it = map.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry<Integer,Integer> entry = it.next();

            int value = entry.getValue();

            it.remove();

            if(map.containsValue(value)){
                return false;
        }
        }


        return true;
    }

    public static void main(String[] args) {

        UniqueNumberOfOccurrences u = new UniqueNumberOfOccurrences();
        int[] arr = {1, 2, 2, 1, 1, 3};

        u.uniqueOccurrences(arr);

    }
}
