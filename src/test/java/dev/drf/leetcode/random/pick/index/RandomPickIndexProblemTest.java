package dev.drf.leetcode.random.pick.index;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.oneOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomPickIndexProblemTest {
    @Test
    void example1() {
        /*
        Input
        ["Solution", "pick", "pick", "pick"]
        [[[1, 2, 3, 3, 3]], [3], [1], [3]]
        Output
        [null, 4, 0, 2]

        Explanation
        Solution solution = new Solution([1, 2, 3, 3, 3]);
        solution.pick(3); // It should return either index 2, 3, or 4 randomly.
                          // Each index should have equal probability of returning.
        solution.pick(1); // It should return 0. Since in the array only nums[0] is equal to 1.
        solution.pick(3); // It should return either index 2, 3, or 4 randomly.
                          // Each index should have equal probability of returning.
         */
        var nums = new int[]{
                1, 2, 3, 3, 3
        };
        var solution = new RandomPickIndexProblem(nums);
        var pick1 = solution.pick(3);
        var pick2 = solution.pick(1);
        var pick3 = solution.pick(3);

        assertThat(pick1, oneOf(2, 3, 4));
        assertEquals(0, pick2);
        assertThat(pick3, oneOf(2, 3, 4));
    }
}
