package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VerifyingAnAlienDictionaryTest {

    VerifyingAnAlienDictionary va;

    @BeforeEach
    void setUp() {

        va = new VerifyingAnAlienDictionary();
    }

    @Test
    void isAlienSorted() {


        String[] words = {"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";

        String[] words1 = {"word", "world", "row"};
        String order1 = "worldabcefghijkmnpqstuvxyz";

        String[] words2 = {"apple", "app"};
        String order2 = "abcdefghijklmnopqrstuvwxyz";

        String[] words3 = {"ubg", "kwh"}; //-6+4
        String order3 = "qcipyamwvdjtesbghlorufnkzx";

        String[] words4 = {"my", "f"}; //-1+6
        String order4 = "gelyriwxzdupkjctbfnqmsavho";

        String[] words5 = {"rb", "fe"};
        String order5 = "kyxopjzluebdsrfgtinhcaqwvm";

        String[] words6 = {"kxvyx","ts"};
        String order6 = "tiwjpbemkhalsqzdvucorfgxyn";


        Assertions.assertAll(
        "VerifyingAnAlienDictionary",
                () -> assertTrue(va.isAlienSorted(words, order)),
                () -> assertFalse(va.isAlienSorted(words1, order1)),
                () -> assertFalse(va.isAlienSorted(words2, order2)),
                () -> assertTrue(va.isAlienSorted(words3, order3)),
                () -> assertFalse(va.isAlienSorted(words4, order4)),
                () -> assertTrue(va.isAlienSorted(words5, order5)),
                () -> assertFalse(va.isAlienSorted(words6, order6))
        );

    }
}


