package dev.drf.leetcode.two.sum.ii.input.array.is.sorted;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSum2InputArrayIsSortedProblemTest {
    private final TwoSum2InputArrayIsSortedProblem problem = new TwoSum2InputArrayIsSortedProblem();

    @Test
    void example1() {
        /*
        Input: numbers = [2,7,11,15], target = 9
        Output: [1,2]
         */
        int[] numbers = new int[]{
                2, 7, 11, 15
        };
        int target = 9;

        var arr = problem.twoSum(numbers, target);

        assertEquals(1, arr[0]);
        assertEquals(2, arr[1]);
    }

    @Test
    void example2() {
        /*
        Input: numbers = [2,3,4], target = 6
        Output: [1,3]
         */
        int[] numbers = new int[]{
                2, 3, 4
        };
        int target = 6;

        var arr = problem.twoSum(numbers, target);

        assertEquals(1, arr[0]);
        assertEquals(3, arr[1]);
    }

    @Test
    void example3() {
        /*
        Input: numbers = [-1,0], target = -1
        Output: [1,2]
         */
        int[] numbers = new int[]{
                -1, 0
        };
        int target = -1;

        var arr = problem.twoSum(numbers, target);

        assertEquals(1, arr[0]);
        assertEquals(2, arr[1]);
    }
}
