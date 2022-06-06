package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindWinnerOnATicTacToeGameTest {

    FindWinnerOnATicTacToeGame tic;

    @BeforeEach
    void setUp() {

        tic = new FindWinnerOnATicTacToeGame();
    }

    @Test
    public void testTic() {

        int[][] movesR = {{0, 0}, {1, 1}, {0, 1}, {1, 2}, {0, 2}};
        int[][] movesC = {{0, 0}, {1, 1}, {1, 0}, {1, 2}, {2, 0}};
        int[][] moves = {{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}};
        int[][] moves1 = {{0, 0}, {1, 1}, {0, 1}, {0, 2}, {1, 0}, {2, 0}};
        int[][] moves2 = {{0, 0}, {1, 1}, {2, 0}, {1, 0}, {1, 2}, {2, 1}, {0, 1}, {0, 2}, {2, 2}};
        int[][] moves3 = {{0, 0}, {1, 1}};
        int[][] moves4 = {{0, 2}, {0, 1}, {2, 1}};
        int[][] moves5 = {{0, 2}, {2, 0}, {2, 1}, {0, 1}, {1, 2}};
        int[][] moves6 = {{2, 0}, {1, 1}, {0, 2}, {2, 1}, {1, 2}, {1, 0}, {0, 0}, {0, 1}};

        assertEquals("A", tic.tictactoe(movesR));
        assertEquals("A", tic.tictactoe(movesC));
        assertEquals("A", tic.tictactoe(moves));
        assertEquals("B", tic.tictactoe(moves1));
        assertEquals("Draw", tic.tictactoe(moves2));
        assertEquals("Pending", tic.tictactoe(moves3));
        assertEquals("Pending", tic.tictactoe(moves4));
        assertEquals("Pending", tic.tictactoe(moves5));
        assertEquals("B", tic.tictactoe(moves6));


    }


}