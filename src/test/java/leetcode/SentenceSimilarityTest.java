package leetcode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceSimilarityTest {
    SentenceSimilarity rm;

    @BeforeEach
    void before() {
        rm = new SentenceSimilarity();

    }

    @Test
    void similarity1() {

        String[] sentence1 = {"great", "acting", "skills"};
        String[] sentence2 = {"fine", "drama", "talent"};
        String[][] similarPairs = {{"great", "fine"}, {"drama", "acting"}, {"skills", "talent"}};



        assertEquals(true, rm.similarity(sentence1, sentence2, similarPairs));

    }

    @Test
    void similarity2() {

        String[] sentence1 = {"great"};
        String[] sentence2 = {"great"};
        String[][] similarPairs = {{}};



        assertEquals(true, rm.similarity(sentence1, sentence2, similarPairs));

    }

    @Test
    void similarity3() {

        String[] sentence1 = {"doubleplus","good"};
        String[] sentence2 = {"great"};
        String[][] similarPairs = {{"great","doubleplus"}};



        assertEquals(false, rm.similarity(sentence1, sentence2, similarPairs));

    }
}