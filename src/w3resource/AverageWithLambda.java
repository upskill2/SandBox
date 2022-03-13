package w3resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AverageWithLambda {

    public Double average(List<Integer> list) {

        list = Arrays.asList(new Integer[]{0, 4, 11, 7, 9, 2, 5});
        return list.stream()
                .mapToInt(i -> i)
                .average()
                .getAsDouble();

    }

    public static void main(String[] args) {
        System.out.println(new AverageWithLambda().average(new ArrayList<>()));
    }

}
