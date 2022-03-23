package w3resource;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindSecondBiggestNumberInArray {

    public Integer find(Integer[] arr) {

       Integer find [] = new Integer[] {45,70,69};

        Stream<Integer> myStream=Arrays.stream(find);
        List list = myStream.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        int result = 0;
        result = (Integer) list.get(1);


        return result;
            }

    public static void main(String[] args) {

        System.out.println(new FindSecondBiggestNumberInArray().find(new Integer[5]));
    }
}
