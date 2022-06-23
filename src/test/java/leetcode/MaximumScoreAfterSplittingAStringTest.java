package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class MaximumScoreAfterSplittingAStringTest {

    MaximumScoreAfterSplittingAString max;

    @BeforeEach
    void setUp() {


        max = new MaximumScoreAfterSplittingAString();

    }

    @Test
    void testSum() {
        String s = "011101";
        String s1 = "00111";
        String s2 = "1111";
        String s3 = "00";
        String s4 = "01001";
        String s5 = "010";
        String s6 = "1011011";
        String s7 = "11100";
        String s8 = "0100";
        String s9 = "00110001011111100111101010100010001101001110";

/*       assertEquals(5, max.maxScore(s));
       assertEquals(5, max.maxScore(s1));
       assertEquals(3, max.maxScore(s2));
        assertEquals(1, max.maxScore(s3));
        assertEquals(4, max.maxScore(s4));
        assertEquals(2, max.maxScore(s5));
        assertEquals(5, max.maxScore(s6));
        assertEquals(2, max.maxScore(s7));
        assertEquals(2, max.maxScore(s8));*/
        assertEquals(26, max.maxScore(s9));


/*        Assertions.assertAll(
                "test",
                (Executable) () -> assertEquals(5, max.maxScore(s)),
        () -> assertEquals(5, max.maxScore(s1)),
        () -> assertEquals(3, max.maxScore(s2)),
        () -> assertEquals(1, max.maxScore(s3)),
        () -> assertEquals(4, max.maxScore(s4)),
        () -> assertEquals(2, max.maxScore(s5)),
        () -> assertEquals(5, max.maxScore(s6)),
        () -> assertEquals(2, max.maxScore(s7))
        );*/

    }
}