package leetcode.tests;

import leetcode.ReverseString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    char[] reverseString() {
        char[] input = {'A', ' ', 'm', 'a', 'n', ',', ' ', 'a', ' ', 'p', 'l', 'a', 'n', ',', ' ', 'a', ' ', 'c', 'a', 'n', 'a', 'l', ':', ' ', 'P', 'a', 'n', 'a', 'm', 'a'};
        char[] expected = {'a', 'm', 'a', 'n', 'a', 'P', ' ', ':', 'l', 'a', 'n', 'a', 'c', ' ', 'a', ' ', ',', 'n', 'a', 'l', 'p', ' ', 'a', ' ', ',', 'n', 'a', 'm', ' ', 'A'};

        ReverseString rss = new ReverseString();
        rss.reverseString(input);

        assertArrayEquals(expected,reverseString());


        return input;
    }

}