package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveOneElementToMakeTheArrayStrictlyIncreasingTest {

    RemoveOneElementToMakeTheArrayStrictlyIncreasing re;

    @BeforeEach
    void setUp() {
        re = new RemoveOneElementToMakeTheArrayStrictlyIncreasing();

    }

    @Test
    void test1() {

        int[] nums = {1, 2, 10, 5, 7};
        int[] nums1 = {2, 3, 1, 2};
        int[] nums2 = {1, 1, 1};
        int[] nums3 = {100, 21, 100, 101};
        int[] nums4 = {100, 21, 3};
        int[] nums5 = {541, 783, 483, 744};
        int[] nums6 = {103, 191, 918, 124, 658};
        int[] nums7 = {2, 3, 4, 5, 1, 5};

        assertTrue(re.canBeIncreasing(nums));
        assertFalse(re.canBeIncreasing(nums1));
        assertFalse(re.canBeIncreasing(nums2));
        assertTrue(re.canBeIncreasing(nums3));
        assertFalse(re.canBeIncreasing(nums4));
        assertFalse(re.canBeIncreasing(nums5));
        assertFalse(re.canBeIncreasing(nums6));
        assertFalse(re.canBeIncreasing(nums7));

    }

}