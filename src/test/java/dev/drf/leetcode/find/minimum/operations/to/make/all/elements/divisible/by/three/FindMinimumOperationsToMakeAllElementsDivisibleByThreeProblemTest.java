package dev.drf.leetcode.find.minimum.operations.to.make.all.elements.divisible.by.three;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMinimumOperationsToMakeAllElementsDivisibleByThreeProblemTest {
    private final FindMinimumOperationsToMakeAllElementsDivisibleByThreeProblem problem = new FindMinimumOperationsToMakeAllElementsDivisibleByThreeProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,2,3,4]
        Output: 3
         */
        int[] nums = {1, 2, 3, 4};

        var output = problem.minimumOperations(nums);

        assertEquals(3, output);
    }

    @Test
    void example2() {
        /*
        Input: nums = [3,6,9]
        Output: 0
         */
        int[] nums = {3, 6, 9};

        var output = problem.minimumOperations(nums);

        assertEquals(0, output);
    }
}
