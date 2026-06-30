package dev.drf.leetcode.harshad.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HarshadNumberProblemTest {
    private final HarshadNumberProblem problem = new HarshadNumberProblem();

    @Test
    void example1() {
        // Input: x = 18
        // Output: 9
        int x = 18;

        int harshad = problem.sumOfTheDigitsOfHarshadNumber(x);

        assertEquals(9, harshad);
    }

    @Test
    void example2() {
        // Input: x = 23
        // Output: -1
        int x = 23;

        int harshad = problem.sumOfTheDigitsOfHarshadNumber(x);

        assertEquals(-1, harshad);
    }
}
