package dev.drf.leetcode.container.with.most.water;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerWithMostWaterProblemTest {
    private final ContainerWithMostWaterProblem problem = new ContainerWithMostWaterProblem();

    @Test
    void example1() {
        /*
        Input: height = [1,8,6,2,5,4,8,3,7]
        Output: 49
         */
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};

        var result = problem.maxArea(height);

        assertEquals(49, result);
    }

    @Test
    void example2() {
        /*
        Input: height = [1,1]
        Output: 1
         */
        int[] height = new int[]{1, 1};

        var result = problem.maxArea(height);

        assertEquals(1, result);
    }

    @Test
    void failed1() {
        // [1,2,4,3]
        int[] height = new int[]{1, 2, 4, 3};

        var result = problem.maxArea(height);

        assertEquals(4, result);
    }

    @Test
    void failed2() {
        // [2,3,4,5,18,17,6]
        int[] height = new int[]{2, 3, 4, 5, 18, 17, 6};

        var result = problem.maxArea(height);

        assertEquals(17, result);
    }
}
