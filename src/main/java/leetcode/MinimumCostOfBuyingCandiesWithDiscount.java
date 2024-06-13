package leetcode;

import java.util.Arrays;
import java.util.Collections;

public class MinimumCostOfBuyingCandiesWithDiscount {

    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int result = 0;
        int freeIndex = 1;
        for (int i = cost.length - 1; i > -1; i--) {
            if (freeIndex != 3) {
                result += cost[i];
                freeIndex++;
            } else {
                freeIndex = 1;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        MinimumCostOfBuyingCandiesWithDiscount m = new MinimumCostOfBuyingCandiesWithDiscount();
        int[] cost = {6, 5, 7, 9, 2, 2};
        int[] cost1 = {5};
        m.minimumCost(cost);
        m.minimumCost(cost1);

    }
}
