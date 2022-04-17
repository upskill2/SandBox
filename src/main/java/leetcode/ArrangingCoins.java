package leetcode;

public class ArrangingCoins {

    public int arrangeCoins(int n) {

        long sum = 0;
        long ind = 1;

        while (sum <= n) {
            sum += ind;
            ind++;
        }

        return (int) (ind-2);
    }

    public static void main(String[] args) {
        ArrangingCoins ac = new ArrangingCoins();
        int n = 8;
        int n1 = 12;
        int n2 = 3;
        int n3 = 1;

        ac.arrangeCoins(n);
        ac.arrangeCoins(n1);
        ac.arrangeCoins(n2);
        ac.arrangeCoins(n3);
    }

}
