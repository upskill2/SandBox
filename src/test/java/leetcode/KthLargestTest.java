package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestTest {

   KthLargest kth;

    @BeforeEach
    void setUp() {

        int k = 3;
        int[] nums = {4, 5, 8, 2};
        kth = new KthLargest(k,nums);

    }

    @Test
    void testAdd() {
        assertEquals(kth.add(3),4);
        assertEquals(kth.add(5),5);
        assertEquals(kth.add(10),5);
        assertEquals(kth.add(9),8);
        assertEquals(kth.add(4),8);

    }

}