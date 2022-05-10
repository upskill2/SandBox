package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesignHashSetTest {

    DesignHashSet myHashSet;

    @BeforeEach
    void setUp() {
      myHashSet = new DesignHashSet();

    }

    @Test
    void testAll(){

        myHashSet.add(1);
        myHashSet.add(2);
        assertTrue(myHashSet.contains(1));
        assertFalse(myHashSet.contains(3));
        myHashSet.add(2);
        assertTrue(myHashSet.contains(2));
        myHashSet.remove(2);
        assertFalse(myHashSet.contains(2));
        myHashSet.add(2);
        myHashSet.add(3);
        myHashSet.remove(2);
    }

}