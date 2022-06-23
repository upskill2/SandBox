package leetcode;

public class FinalPricesWithASpecialDiscountInAShop {

    public int[] finalPrices(int[] prices) {

        int[] res = new int[prices.length];

        res[prices.length - 1] = prices[prices.length - 1];
        for (int i = 0; i < prices.length - 1; i++) {
            int minIdx = findMinIndex(prices, i);
            if (minIdx == -1) {
                res[i] = prices[i];
            } else {
                res[i] = prices[i] - prices[minIdx];

            }

        }

        return res;
    }

    private int findMinIndex(int[] ar, int currentIdx) {
        int min = ar[currentIdx];
        int resIdx = -1;
        for (int i = currentIdx + 1; i < ar.length; i++) {
            if (ar[i] <= min) {
                //       min = ar[i];
                resIdx = i;
                break;
            }


        }
        return resIdx;
    }

    public static void main(String[] args) {
        FinalPricesWithASpecialDiscountInAShop shp = new FinalPricesWithASpecialDiscountInAShop();

        int[] prices = {8, 4, 6, 2, 3};
        int[] prices1 = {1, 2, 3, 4, 5};
        int[] prices2 = {10, 1, 1, 6};


        shp.finalPrices(prices);
        shp.finalPrices(prices1);
        shp.finalPrices(prices2);
    }
}
