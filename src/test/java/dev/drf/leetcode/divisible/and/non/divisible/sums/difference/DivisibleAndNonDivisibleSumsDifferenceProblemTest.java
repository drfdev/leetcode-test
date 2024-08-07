package dev.drf.leetcode.divisible.and.non.divisible.sums.difference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisibleAndNonDivisibleSumsDifferenceProblemTest {
    private final DivisibleAndNonDivisibleSumsDifferenceProblem problem = new DivisibleAndNonDivisibleSumsDifferenceProblem();

    @Test
    void example1() {
        /*
        Input: n = 10, m = 3
        Output: 19
         */
        int n = 10, m = 3;

        var out = problem.differenceOfSums(n, m);

        assertEquals(19, out);
    }

    @Test
    void example2() {
        /*
        Input: n = 5, m = 6
        Output: 15
         */
        int n = 5, m = 6;

        var out = problem.differenceOfSums(n, m);

        assertEquals(15, out);
    }

    @Test
    void example3() {
        /*
        Input: n = 5, m = 1
        Output: -15
         */
        int n = 5, m = 1;

        var out = problem.differenceOfSums(n, m);

        assertEquals(-15, out);
    }
}
