package dev.drf.leetcode.combination.sum.iii;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CombinationSumIIIProblemTest {
    private final CombinationSumIIIProblem problem = new CombinationSumIIIProblem();

    @Test
    void example1() {
        /*
        Input: k = 3, n = 7
        Output: [[1,2,4]]
         */
        int k = 3, n = 7;

        var result = problem.combinationSum3(k, n);

        assertThat(result, containsInAnyOrder(
                containsInAnyOrder(1, 2, 4)
        ));
    }

    @Test
    void example2() {
        /*
        Input: k = 3, n = 9
        Output: [[1,2,6],[1,3,5],[2,3,4]]
         */
        int k = 3, n = 9;

        var result = problem.combinationSum3(k, n);

        assertThat(result, containsInAnyOrder(
                containsInAnyOrder(1, 2, 6),
                containsInAnyOrder(1, 3, 5),
                containsInAnyOrder(2, 3, 4)
        ));
    }

    @Test
    void example3() {
        /*
        Input: k = 4, n = 1
        Output: []
         */
        int k = 4, n = 1;

        var result = problem.combinationSum3(k, n);

        assertTrue(result.isEmpty());
    }

    @Test
    void failed1() {
        /*
        k = 8, n = 36
        time limit exceed
         */
        int k = 8, n = 36;

        var result = problem.combinationSum3(k, n);

        // [[1,2,3,4,5,6,7,8]]
        assertThat(result, containsInAnyOrder(
                containsInAnyOrder(1, 2, 3, 4, 5, 6, 7, 8)
        ));
    }
}
