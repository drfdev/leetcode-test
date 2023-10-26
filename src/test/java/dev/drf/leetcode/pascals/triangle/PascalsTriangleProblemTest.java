package dev.drf.leetcode.pascals.triangle;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class PascalsTriangleProblemTest {
    private final PascalsTriangleProblem problem = new PascalsTriangleProblem();

    @Test
    void example1() {
        /*
        Input: numRows = 5
        Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
         */
        int numRows = 5;

        var triangle = problem.generate(numRows);

        assertThat(triangle, contains(
                contains(1),
                contains(1, 1),
                contains(1, 2, 1),
                contains(1, 3, 3, 1),
                contains(1, 4, 6, 4, 1)
        ));
    }

    @Test
    void example2() {
        /*
        Input: numRows = 1
        Output: [[1]]
         */
        int numRows = 1;

        var triangle = problem.generate(numRows);

        assertThat(triangle, contains(
                contains(1)
        ));
    }
}
