package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DestinationCity {
    public String destCity(List<List<String>> paths) {

        String res = paths.get(0).get(1);

        if (paths.size() > 1) {

            int next = 0;
            res = paths.get(next).get(1);
            paths.remove(paths.get(next));

            while (paths.size() > 0) {

                next = findNextStop(paths, res);
                if (next != -1) {
                    res = paths.get(next).get(1);
                    paths.remove(paths.get(next));
                } else {
                    return res;
                }

            }

        }
        return res;
    }


    public int findNextStop(List<List<String>> paths, String element) {

        int res = -1;

        for (int i = 0; i < paths.size(); i++) {
            if (paths.get(i).get(0).equals(element)) {
                res = i;
                break;


            }

        }


        return res;
    }

    public static void main(String[] args) {
        DestinationCity dest = new DestinationCity();

        List<List<String>> paths = new ArrayList<List<String>>();
        List<String> list1 = Arrays.asList("London", "New York");
        List<String> list2 = Arrays.asList("New York", "Lima");
        List<String> list3 = Arrays.asList("Lima", "Sao Paulo");

        paths.add(list1);
        paths.add(list2);
        paths.add(list3);

        dest.destCity(paths);


        List<List<String>> paths1 = new ArrayList<List<String>>();
        List<String> list4 = Arrays.asList("B", "C");
        List<String> list5 = Arrays.asList("D", "B");
        List<String> list6 = Arrays.asList("C", "A");

        paths1.add(list4);
        paths1.add(list5);
        paths1.add(list6);

        dest.destCity(paths1);
    }
}
