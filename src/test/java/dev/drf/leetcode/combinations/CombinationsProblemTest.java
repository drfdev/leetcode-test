package dev.drf.leetcode.combinations;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class CombinationsProblemTest {
    private final CombinationsProblem problem = new CombinationsProblem();

    @Test
    void example1() {
        /*
        Input: n = 4, k = 2
        Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
         */
        int n = 4, k = 2;

        var out = problem.combine(n, k);

        assertThat(out, containsInAnyOrder(
                containsInAnyOrder(1, 2),
                containsInAnyOrder(1, 3),
                containsInAnyOrder(1, 4),
                containsInAnyOrder(2, 3),
                containsInAnyOrder(2, 4),
                containsInAnyOrder(3, 4)
        ));
    }

    @Test
    void example2() {
        /*
        Input: n = 1, k = 1
        Output: [[1]]
         */
        int n = 1, k = 1;

        var out = problem.combine(n, k);

        assertThat(out, containsInAnyOrder(
                containsInAnyOrder(1)
        ));
    }
}
