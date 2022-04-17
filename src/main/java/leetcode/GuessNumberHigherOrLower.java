package leetcode;

import leetcode.resources.GuessGame;

public class GuessNumberHigherOrLower extends GuessGame {


    public int guessNumber(int n) {

        int result = n;
        int mid = 0;
        int low = 1;



        while (guess((int) result) != 0) {
            if (guess((int) result) == -1) {  //higher -1
                result = (result + low) / 2;

            } else  {
                low = result;
                result = result + 1;
                mid=(result+low)/2;
            }

        }


        System.out.println("Result is " + result);
        return (int) result;
    }

    public static void main(String[] args) {
        int n = 921239930;

        GuessNumberHigherOrLower gn = new GuessNumberHigherOrLower();
        gn.guessNumber(n);
    }

}
