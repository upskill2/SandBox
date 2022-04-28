package leetcode;

import leetcode.Sqrt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSqrt {

    @Test
    public void testSqrt() {
        Sqrt sqrt = new Sqrt();
        assertEquals(3, sqrt.mySqrt(9));
        assertEquals(2, sqrt.mySqrt(4));
        assertEquals(2, sqrt.mySqrt(8));
        assertEquals(2000, sqrt.mySqrt(4000000));
        assertEquals(46340, sqrt.mySqrt(2147395600));
    }

    //2,147,395,600
    //can hold 2,147,483,647

}