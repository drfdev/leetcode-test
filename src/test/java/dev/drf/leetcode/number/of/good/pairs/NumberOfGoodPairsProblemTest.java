package dev.drf.leetcode.number.of.good.pairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfGoodPairsProblemTest {
    private final NumberOfGoodPairsProblem problem = new NumberOfGoodPairsProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,2,3,1,1,3]
        Output: 4
         */
        int[] nums = new int[]{
                1, 2, 3, 1, 1, 3
        };

        var count = problem.numIdenticalPairs(nums);

        assertEquals(4, count);
    }

    @Test
    void example2() {
        /*
        Input: nums = [1,1,1,1]
        Output: 6
         */
        int[] nums = new int[]{
                1, 1, 1, 1
        };

        var count = problem.numIdenticalPairs(nums);

        assertEquals(6, count);
    }

    @Test
    void example3() {
        /*
        Input: nums = [1,2,3]
        Output: 0
         */
        int[] nums = new int[]{
                1, 2, 3
        };

        var count = problem.numIdenticalPairs(nums);

        assertEquals(0, count);
    }

    @Test
    void failed1() {
        /*
        nums = [4,4,2,2]
        Expected = 2
         */
        int[] nums = new int[]{
                4, 4, 2, 2
        };

        var count = problem.numIdenticalPairs(nums);

        assertEquals(2, count);
    }
}
