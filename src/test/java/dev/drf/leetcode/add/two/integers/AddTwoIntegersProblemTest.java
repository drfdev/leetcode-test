package dev.drf.leetcode.add.two.integers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTwoIntegersProblemTest {
    private final AddTwoIntegersProblem problem = new AddTwoIntegersProblem();

    @Test
    void example1() {
        /*
        Input: num1 = 12, num2 = 5
        Output: 17
         */
        int num1 = 12, num2 = 5;

        var result = problem.sum(num1, num2);

        assertEquals(17, result);
    }

    @Test
    void example2() {
        /*
        Input: num1 = -10, num2 = 4
        Output: -6
         */
        int num1 = -10, num2 = 4;

        var result = problem.sum(num1, num2);

        assertEquals(-6, result);
    }
}
