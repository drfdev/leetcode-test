package dev.drf.leetcode.sum.multiples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumMultiplesProblemTest {
    private final SumMultiplesProblem problem = new SumMultiplesProblem();

    @Test
    void example1() {
        // Input: n = 7
        // Output: 21
        int n = 7;

        int out = problem.sumOfMultiples(n);

        assertEquals(21, out);
    }

    @Test
    void example2() {
        // Input: n = 10
        // Output: 40
        int n = 10;

        int out = problem.sumOfMultiples(n);

        assertEquals(40, out);
    }

    @Test
    void example3() {
        // Input: n = 9
        // Output: 30
        int n = 9;

        int out = problem.sumOfMultiples(n);

        assertEquals(30, out);
    }

    @Test
    void failure1() {
        // n = 15
        // 81
        int n = 15;

        int out = problem.sumOfMultiples(n);

        assertEquals(81, out);
    }
}
