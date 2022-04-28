package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DegreeOfAnArrayTest {

    DegreeOfAnArray da;

    @BeforeEach
    void setUp() {
        da = new DegreeOfAnArray();
    }


    @Test
    @DisplayName("A special test case")
    void findShortestSubArray() {
        int[] nums = {1, 2, 2, 3, 1};
        int[] nums1 = {1, 2, 2, 3, 1, 4, 2};
        int[] nums2 = {1, 5, 2, 3, 5, 4, 5, 6};
        int[] nums3 = {1, 1, 2, 2, 2, 1};
        int[] nums4 = {3, 2, 1, 1, 3, 2};
        assertEquals(2, da.findShortestSubArray(nums));
        assertEquals(6, da.findShortestSubArray(nums1));
        assertEquals(6, da.findShortestSubArray(nums2));
        assertEquals(3, da.findShortestSubArray(nums3));
        assertEquals(2, da.findShortestSubArray(nums4));
    }

}