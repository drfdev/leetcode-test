package dev.drf.leetcode.divide.two.integers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideTwoIntegersProblemTest {
    private final DivideTwoIntegersProblem problem = new DivideTwoIntegersProblem();

    @Test
    void example1() {
        /*
        Input: dividend = 10, divisor = 3
        Output: 3
         */
        int dividend = 10, divisor = 3;

        int result = problem.divide(dividend, divisor);

        assertEquals(3, result);
    }

    @Test
    void example2() {
        /*
        Input: dividend = 7, divisor = -3
        Output: -2
         */
        int dividend = 7, divisor = -3;

        int result = problem.divide(dividend, divisor);

        assertEquals(-2, result);
    }

    @Test
    void myTest1() {
        int dividend = 1, divisor = 1;

        int result = problem.divide(dividend, divisor);

        assertEquals(1, result);
    }

    @Test
    void myTest2() {
        int dividend = 0, divisor = 1;

        int result = problem.divide(dividend, divisor);

        assertEquals(0, result);
    }

    @Test
    void myTest3() {
        int dividend = 3, divisor = 10;

        int result = problem.divide(dividend, divisor);

        assertEquals(0, result);
    }

    @Test
    void failed1() {
        /*
        -2147483648
        -1
         */
        int dividend = -2147483648, divisor = -1;

        int result = problem.divide(dividend, divisor);

        assertEquals(2147483647, result);
    }

    @Test
    void failed2() {
        /*
        -2147483648
        1
         */
        int dividend = -2147483648, divisor = 1;

        int result = problem.divide(dividend, divisor);

        assertEquals(-2147483648, result);
    }

    @Test
    void failed3() {
        /*
        -2147483648
        2
         */
        int dividend = -2147483648, divisor = 2;

        int result = problem.divide(dividend, divisor);

        assertEquals(-1073741824, result);
    }
}
