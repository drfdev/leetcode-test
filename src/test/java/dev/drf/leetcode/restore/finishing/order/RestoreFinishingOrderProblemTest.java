package dev.drf.leetcode.restore.finishing.order;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RestoreFinishingOrderProblemTest {
    private final RestoreFinishingOrderProblem problem = new RestoreFinishingOrderProblem();

    @Test
    void example1() {
        // Input: order = [3,1,2,5,4], friends = [1,3,4]
        // Output: [3,1,4]
        int[] order = {3, 1, 2, 5, 4};
        int[] friends = {1, 3, 4};

        var out = problem.recoverOrder(order, friends);

        int[] expected = {3, 1, 4};
        assertArrayEquals(expected, out);
    }

    @Test
    void example2() {
        // Input: order = [1,4,5,3,2], friends = [2,5]
        // Output: [5,2]
        int[] order = {1, 4, 5, 3, 2};
        int[] friends = {2, 5};

        var out = problem.recoverOrder(order, friends);

        int[] expected = {5, 2};
        assertArrayEquals(expected, out);
    }
}
