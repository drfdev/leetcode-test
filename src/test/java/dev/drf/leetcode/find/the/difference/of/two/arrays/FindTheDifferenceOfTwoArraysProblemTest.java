package dev.drf.leetcode.find.the.difference.of.two.arrays;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FindTheDifferenceOfTwoArraysProblemTest {
    private final FindTheDifferenceOfTwoArraysProblem problem = new FindTheDifferenceOfTwoArraysProblem();

    @Test
    void example1() {
        /*
        Input: nums1 = [1,2,3], nums2 = [2,4,6]
        Output: [[1,3],[4,6]]
         */
        int[] nums1 = new int[]{1, 2, 3};
        int[] nums2 = new int[]{2, 4, 6};

        var result = problem.findDifference(nums1, nums2);

        assertThat(result, contains(
                contains(1, 3),
                contains(4, 6)
        ));
    }

    @Test
    void example2() {
        /*
        Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
        Output: [[3],[]]
         */
        int[] nums1 = new int[]{1, 2, 3, 3};
        int[] nums2 = new int[]{1, 1, 2, 2};

        var result = problem.findDifference(nums1, nums2);

        assertEquals(2, result.size());

        assertEquals(3, result.get(0).get(0));
        assertEquals(1, result.get(0).size());

        assertTrue(result.get(1).isEmpty());
    }
}
