package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesignHashMapTest {

    DesignHashMap<Integer, Integer> dh;

    @BeforeEach
    void setUp() {

        dh = new DesignHashMap<Integer, Integer>();
    }

    @Test
    void hashMapTest() {

        dh.put(1, 1);
        assertEquals(1, dh.size());
        dh.put(2, 2); // The map is now [[1,1], [2,2]]
        assertEquals(2, dh.size());
        assertEquals(1, dh.get(1)); // return 1, The map is now [[1,1], [2,2]]
        assertEquals(-1, dh.get(3)); // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
        dh.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
        assertEquals(2, dh.size());
        assertEquals(1, dh.get(2));   // return 1, The map is now [[1,1], [2,1]]
        dh.remove(2); // remove the mapping for 2, The map is now [[1,1]]
        assertEquals(-1,dh.get(2));    // return -1 (i.e., not found), The map is now [[1,1]]


    }

}