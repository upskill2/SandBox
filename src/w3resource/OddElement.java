package w3resource;

import java.util.Arrays;
import java.util.List;

public class OddElement {

    public Integer getElement(List<Integer> list, Integer n) {

        int n1 = 1;
        n = n1;

        //list = Arrays.asList(new Integer[]{3, 79,55,3});
        list = Arrays.asList(new Integer[]{0,1});


        int index = -1;
        int result = 0;
        if (n+1 > list.size()) {
            return -1;
        } else for (int i = 0; i < list.size(); i++) {
            index++;
            if (list.get(i) % 2 != 0) {
                for (int j = index; j < list.size(); j++) {
                   index ++;
                    if (j == n) {
                        result = list.get(j);
                    }
                }

            }
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(new OddElement().getElement(Arrays.asList(new Integer[]{}), 0));
    }

}
