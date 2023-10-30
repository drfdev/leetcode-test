package dev.drf.leetcode.pascals.triangle.ii;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class PascalsTriangleIIProblemTest {
    private final PascalsTriangleIIProblem problem = new PascalsTriangleIIProblem();

    @Test
    void example1() {
        /*
        Input: rowIndex = 3
        Output: [1,3,3,1]
         */
        int rowIndex = 3;

        var list = problem.getRow(rowIndex);

        assertThat(list, contains(
                1, 3, 3, 1
        ));
    }

    @Test
    void example2() {
        /*
        Input: rowIndex = 0
        Output: [1]
         */
        int rowIndex = 0;

        var list = problem.getRow(rowIndex);

        assertThat(list, contains(
                1
        ));
    }

    @Test
    void example3() {
        /*
        Input: rowIndex = 1
        Output: [1,1]
         */
        int rowIndex = 1;

        var list = problem.getRow(rowIndex);

        assertThat(list, contains(
                1, 1
        ));
    }

    @Test
    void myTest1() {
        // n = 9
        int rowIndex = 9;

        var list = problem.getRow(rowIndex);

        assertThat(list, contains(
                1, 9, 36, 84, 126, 126, 84, 36, 9, 1
        ));
    }
}
