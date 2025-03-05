package dev.drf.leetcode.count.total.number.of.colored.cells;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTotalNumberOfColoredCellsProblemTest {
    private final CountTotalNumberOfColoredCellsProblem problem = new CountTotalNumberOfColoredCellsProblem();

    @Test
    void example1() {
        // Input: n = 1
        // Output: 1
        int n = 1;

        var out = problem.coloredCells(n);

        assertEquals(1L, out);
    }

    @Test
    void example2() {
        // Input: n = 2
        // Output: 5
        int n = 2;

        var out = problem.coloredCells(n);

        assertEquals(5L, out);
    }

    @Test
    void myTest1() {
        // n = 3
        /*
            X
          X X X
        X X X X X
          X X X
            X
         */
        int n = 3;

        var out = problem.coloredCells(n);

        assertEquals(13L, out);
    }

    @Test
    void myTest2() {
        // n = 4
        /*
              X         1
            X X X       3
          X X X X X     5
        X X X X X X X   7
          X X X X X     5
            X X X       3
              X         1
         */
        int n = 4;

        var out = problem.coloredCells(n);

        assertEquals(25L, out);
    }

    @Test
    void myTest3() {
        // n = 5
        /*
                X           1
              X X X         3
            X X X X X       5
          X X X X X X X     7
        X X X X X X X X X   9
          X X X X X X X     7
            X X X X X       5
              X X X         3
                X           1
         */
        int n = 5;

        var out = problem.coloredCells(n);

        assertEquals(41L, out);
    }
}
