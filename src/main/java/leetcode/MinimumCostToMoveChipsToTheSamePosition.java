package leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MinimumCostToMoveChipsToTheSamePosition {

    public int minCostToMoveChips(int[] position) {

        int even_cnt = 0;
        int odd_cnt = 0;
        for (int i : position) {
            if (i % 2 == 0) {
                even_cnt++;
            } else {
                odd_cnt++;
            }
        }
        return Math.min(odd_cnt, even_cnt);

    }

    public static void main(String[] args) {
        MinimumCostToMoveChipsToTheSamePosition md = new MinimumCostToMoveChipsToTheSamePosition();

        int[] pos = {2, 2, 2, 3, 3};

        md.minCostToMoveChips(pos);

    }

}
