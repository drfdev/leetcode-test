package dev.drf.leetcode.largest.divisible.subset;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class LargestDivisibleSubsetProblemTest {
    private final LargestDivisibleSubsetProblem problem = new LargestDivisibleSubsetProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,2,3]
        Output: [1,2]
        Explanation: [1,3] is also accepted.
         */
        int[] nums = {1, 2, 3};

        var out = problem.largestDivisibleSubset(nums);

        assertThat(out, containsInAnyOrder(
                1, 2
        ));
    }

    @Test
    void example2() {
        /*
        Input: nums = [1,2,4,8]
        Output: [1,2,4,8]
         */
        int[] nums = {1, 2, 4, 8};

        var out = problem.largestDivisibleSubset(nums);

        assertThat(out, containsInAnyOrder(
                1, 2, 4, 8
        ));
    }
}
