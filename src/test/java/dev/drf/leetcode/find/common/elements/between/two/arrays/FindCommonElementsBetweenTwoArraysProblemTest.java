package dev.drf.leetcode.find.common.elements.between.two.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindCommonElementsBetweenTwoArraysProblemTest {
    private final FindCommonElementsBetweenTwoArraysProblem problem = new FindCommonElementsBetweenTwoArraysProblem();

    @Test
    void example1() {
        // Input: nums1 = [2,3,2], nums2 = [1,2]
        // Output: [2,1]
        int[] nums1 = {2, 3, 2};
        int[] nums2 = {1, 2};

        var out = problem.findIntersectionValues(nums1, nums2);

        int[] expected = {2, 1};
        assertArrayEquals(expected, out);
    }

    @Test
    void example2() {
        // Input: nums1 = [4,3,2,3,1], nums2 = [2,2,5,2,3,6]
        // Output: [3,4]
        int[] nums1 = {4, 3, 2, 3, 1};
        int[] nums2 = {2, 2, 5, 2, 3, 6};

        var out = problem.findIntersectionValues(nums1, nums2);

        int[] expected = {3, 4};
        assertArrayEquals(expected, out);
    }

    @Test
    void example3() {
        // Input: nums1 = [3,4,2,3], nums2 = [1,5]
        // Output: [0,0]
        int[] nums1 = {3, 4, 2, 3};
        int[] nums2 = {1, 5};

        var out = problem.findIntersectionValues(nums1, nums2);

        int[] expected = {0, 0};
        assertArrayEquals(expected, out);
    }
}
