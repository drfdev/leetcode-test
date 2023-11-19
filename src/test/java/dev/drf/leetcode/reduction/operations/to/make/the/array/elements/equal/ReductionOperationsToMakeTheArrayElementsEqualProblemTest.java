package dev.drf.leetcode.reduction.operations.to.make.the.array.elements.equal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReductionOperationsToMakeTheArrayElementsEqualProblemTest {
    private final ReductionOperationsToMakeTheArrayElementsEqualProblem problem = new ReductionOperationsToMakeTheArrayElementsEqualProblem();

    @Test
    void example1() {
        /*
        Input: nums = [5,1,3]
        Output: 3
         */
        int[] nums = new int[]{
                5, 1, 3
        };

        var operations = problem.reductionOperations(nums);

        assertEquals(3, operations);
    }

    @Test
    void example2() {
        /*
        Input: nums = [1,1,1]
        Output: 0
         */
        int[] nums = new int[]{
                1, 1, 1
        };

        var operations = problem.reductionOperations(nums);

        assertEquals(0, operations);
    }

    @Test
    void example3() {
        /*
        Input: nums = [1,1,2,2,3]
        Output: 4
         */
        int[] nums = new int[]{
                1, 1, 2, 2, 3
        };

        var operations = problem.reductionOperations(nums);

        assertEquals(4, operations);
    }

    @Test
    void myTest1() {
        int[] nums = new int[]{
                1, 5, 1
        };

        var operations = problem.reductionOperations(nums);

        assertEquals(1, operations);
    }
}
