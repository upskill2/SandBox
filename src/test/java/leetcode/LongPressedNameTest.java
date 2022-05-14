package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongPressedNameTest {

    LongPressedName lp;

    @BeforeEach
    void setUp() {
        lp = new LongPressedName();

    }

    @Test
    void isLongPressedName() {
        String name = "alex", typed = "aaleex";
        String name1 = "saeed", typed1 = "ssaaedd";
        String name2 = "leelee", typed2 = "lleeelee";
        String name3 = "vtkgn", typed3 = "vttkgnn";
        String name4 = "a", typed4 = "b";
        String name5 = "rick", typed5 = "kric";
        String name6 = "alexd", typed6 = "ale";
        String name7 = "pyplrz", typed7 = "ppyypllr";

        assertEquals(true, lp.isLongPressedName(name, typed));
        assertEquals(false, lp.isLongPressedName(name1, typed1));
        assertEquals(true, lp.isLongPressedName(name2, typed2));
        assertEquals(true, lp.isLongPressedName(name3, typed3));
        assertEquals(false, lp.isLongPressedName(name4, typed4));
        assertEquals(false, lp.isLongPressedName(name5, typed5));
        assertEquals(false, lp.isLongPressedName(name6, typed6));
        assertEquals(false, lp.isLongPressedName(name7, typed7));

    }

}