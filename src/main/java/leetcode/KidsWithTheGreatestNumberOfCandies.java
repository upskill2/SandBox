package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>(candies.length);

        IntSummaryStatistics stat = Arrays.stream(candies).summaryStatistics();
        int max = stat.getMax();

        for (int el : candies

        ) {
        boolean rest = el + extraCandies >= max;
                list.add(rest);
        }



        return list;
}

    public static void main(String[] args) {
        KidsWithTheGreatestNumberOfCandies lids = new KidsWithTheGreatestNumberOfCandies();
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        lids.kidsWithCandies(candies, extraCandies);
    }
}
