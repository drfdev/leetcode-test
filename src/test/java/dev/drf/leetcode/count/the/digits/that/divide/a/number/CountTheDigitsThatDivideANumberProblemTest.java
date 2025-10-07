package dev.drf.leetcode.count.the.digits.that.divide.a.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTheDigitsThatDivideANumberProblemTest {
    private final CountTheDigitsThatDivideANumberProblem problem = new CountTheDigitsThatDivideANumberProblem();

    @Test
    void example1() {
        // Input: num = 7
        // Output: 1
        int num = 7;

        var out = problem.countDigits(num);

        assertEquals(1, out);
    }

    @Test
    void example2() {
        // Input: num = 121
        // Output: 2
        int num = 121;

        var out = problem.countDigits(num);

        assertEquals(2, out);
    }

    @Test
    void example3() {
        // Input: num = 1248
        // Output: 4
        int num = 1248;

        var out = problem.countDigits(num);

        assertEquals(4, out);
    }
}
