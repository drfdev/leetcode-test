package dev.drf.leetcode.find.missing.elements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMissingElementsProblemTest {
    private final FindMissingElementsProblem problem = new FindMissingElementsProblem();

    @Test
    void example1() {
        // Input: nums = [1,4,2,5]
        // Output: [3]
        int[] nums = {1, 4, 2, 5};

        var list = problem.findMissingElements(nums);

        assertEquals(1, list.size());
        assertEquals(3, list.get(0));
    }

    @Test
    void example2() {
        // Input: nums = [7,8,6,9]
        // Output: []
        int[] nums = {7, 8, 6, 9};

        var list = problem.findMissingElements(nums);

        assertEquals(0, list.size());
    }

    @Test
    void example3() {
        // Input: nums = [5,1]
        // Output: [2,3,4]
        int[] nums = {5, 1};

        var list = problem.findMissingElements(nums);

        assertEquals(3, list.size());
        assertEquals(2, list.get(0));
        assertEquals(3, list.get(1));
        assertEquals(4, list.get(2));
    }
}
