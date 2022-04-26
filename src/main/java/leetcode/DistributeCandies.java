package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DistributeCandies {

    public int distributeCandies(int[] candyType) {

        int len = candyType.length; //4
        Set<Integer> mySet = Arrays.stream(candyType).boxed().collect(Collectors.toSet());

        int setSize = mySet.size();  //1, 1, 2, 3

        return Math.min(len/2,setSize);
    }

    public static void main(String[] args) {

        int[] candyType = {1, 1, 2, 3};

        new DistributeCandies().distributeCandies(candyType);
    }

}
