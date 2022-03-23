package leetcode;

import java.util.Arrays;

public class BestTimetoBuyandSellStock {

    public int maxProfit(int[] prices) {

        int mymax = 0;
        int sell = 0;
        int index = -1;

        for (int v : prices

        ) {
            index++;
            for (int i = index; i < prices.length; i++) {  //{1, 2}
                sell = prices[i] - v;
                mymax = Math.max(mymax, sell);
            }
        }
        return mymax;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};
        int[] prices3 = {1, 2};
        BestTimetoBuyandSellStock bt = new BestTimetoBuyandSellStock();

        System.out.println(bt.maxProfit(prices));
        System.out.println(bt.maxProfit(prices2));
        System.out.println(bt.maxProfit(prices3));

    }

}
