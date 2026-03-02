package dev.drf.leetcode.total.waviness.of.numbers.in.range.i;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TotalWavinessOfNumbersInRangeIProblemTest {
    private final TotalWavinessOfNumbersInRangeIProblem problem = new TotalWavinessOfNumbersInRangeIProblem();

    @Test
    void example1() {
        // Input: num1 = 120, num2 = 130
        // Output: 3
        int num1 = 120, num2 = 130;

        int out = problem.totalWaviness(num1, num2);

        assertEquals(3, out);
    }

    @Test
    void example2() {
        // Input: num1 = 198, num2 = 202
        // Output: 3
        int num1 = 198, num2 = 202;

        int out = problem.totalWaviness(num1, num2);

        assertEquals(3, out);
    }

    @Test
    void example3() {
        // Input: num1 = 4848, num2 = 4848
        // Output: 2
        int num1 = 4848, num2 = 4848;

        int out = problem.totalWaviness(num1, num2);

        assertEquals(2, out);
    }
}
