package w3resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Average {

    public Double average(List<Integer> list) {

        list = Arrays.asList(new Integer[]{0, 4, 11, 7, 9, 2, 5});
        int sum = 0;
        for (int i : list
             ) {sum +=i;
            
        }

        return (double) sum/ list.size();
    }

    public static void main(String[] args) {
        System.out.println(new Average().average(new ArrayList<>()));
    }

}
