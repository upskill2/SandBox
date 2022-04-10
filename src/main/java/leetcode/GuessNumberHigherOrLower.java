package leetcode;

import leetcode.resources.GuessGame;

public class GuessNumberHigherOrLower extends GuessGame {


    public int guessNumber(int n) {

        long result = 0;
        long mid = 0;
        long low = 1;

        result=n;



        while (guess((int) result) != 0) {
            if (guess((int) result) == -1) {  //higher -1
                result = (result + low) / 2;

            } else if (guess((int) result) == 1) {
                low = result;
                result = result + 1;
                mid=(result+low)/2;
            }

        }


        System.out.println("Result is " + result);
        return (int) result;
    }

    public static void main(String[] args) {
        int n = 10;

        GuessNumberHigherOrLower gn = new GuessNumberHigherOrLower();
        gn.guessNumber(n);
    }

}
