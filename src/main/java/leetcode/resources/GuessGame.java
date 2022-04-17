package leetcode.resources;

import leetcode.GuessNumberHigherOrLower;

public class GuessGame {

    public int guess(int n) {
        int guessResult = 823161948;

        if (n < guessResult) {
            return 1;
        } else if (n > guessResult) {
            return -1;
        } else return 0;


    }

}
