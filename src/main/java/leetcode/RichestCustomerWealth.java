package leetcode;

public class RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {

        int wealth = 0;
        int temp = 0;

        for (int[] account : accounts) {
            wealth = Math.max(wealth, temp);
            temp = 0;

            for (int i : account) {
                temp += i;

            }

        }

        return Math.max(wealth, temp);
    }

    public static void main(String[] args) {

        RichestCustomerWealth ric = new RichestCustomerWealth();
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};

        ric.maximumWealth(accounts);


    }
}
