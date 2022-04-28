package leetcode;

import leetcode.BaseballGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BaseballGameTest {

    @Test
    void calPoints() {
        BaseballGame bg = new BaseballGame();

        String[] ops = {"5","2","C","D","+"};
        String[] ops1 = {"5","-2","4","C","D","9","+","+"};
        String[] ops2 = {"1"};
        String[] ops3 = {"-60","D","-36","30","13","C","C","-33","53","79"};

        assertEquals(30,bg.calPoints(ops));
        assertEquals(27,bg.calPoints(ops1));
        assertEquals(1,bg.calPoints(ops2));
        assertEquals(-117,bg.calPoints(ops3));

    }

}