package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class RelativeRanks {

    public String[] findRelativeRanks(int[] score) {

        List<Integer> list = Arrays.stream(score).boxed().collect(Collectors.toList());

        int[] sorted = score.clone();
        Arrays.sort(sorted);

        List<Integer> lst =Arrays.stream(sorted).boxed().collect(Collectors.toList());
        List<Integer> sortedlist = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        String[] res = new String[lst.size()];

        for (int i = 0; i < res.length; i++) {
            switch (sortedlist.indexOf(list.get(i))) {
                case 0:
                    res[i] = "Gold Medal";
                    break;
                case 1:
                    res[i] = "Silver Medal";
                    break;
                case 2:
                    res[i] = "Bronze Medal";
                    break;
                default: res[i]= String.valueOf(sortedlist.indexOf(list.get(i))+1);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        RelativeRanks rr = new RelativeRanks();
        int[] score = new int[]{10, 3, 8, 9, 4};
        int[] score1 = new int[]{5,4,3,2,1};

        rr.findRelativeRanks(score);
        //rr.findRelativeRanks(score1);
    }

}
