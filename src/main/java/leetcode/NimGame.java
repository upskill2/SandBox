package leetcode;

public class NimGame {

    public boolean canWinNim(int n) {


        return n % 4==0;
    }

    public static void main(String[] args) {

        int n = 8;
        int n1 = 1;

        NimGame nimGame = new NimGame();

        System.out.println(nimGame.canWinNim(n));
        System.out.println(nimGame.canWinNim(n1));

    }

}
