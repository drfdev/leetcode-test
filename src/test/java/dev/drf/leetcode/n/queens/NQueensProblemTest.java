package dev.drf.leetcode.n.queens;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class NQueensProblemTest {
    private final NQueensProblem problem = new NQueensProblem();

    @Test
    void example1() {
        /*
        Input: n = 4
        Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
         */
        int n = 4;

        var out = problem.solveNQueens(n);

        assertThat(out, containsInAnyOrder(
                contains(".Q..", "...Q", "Q...", "..Q."),
                contains("..Q.", "Q...", "...Q", ".Q..")
        ));
    }

    @Test
    void example2() {
        /*
        Input: n = 1
        Output: [["Q"]]
         */
        int n = 1;

        var out = problem.solveNQueens(n);

        assertThat(out, containsInAnyOrder(
                contains("Q")
        ));
    }
}
