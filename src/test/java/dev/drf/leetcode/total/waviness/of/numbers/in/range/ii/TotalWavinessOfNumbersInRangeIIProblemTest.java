package dev.drf.leetcode.total.waviness.of.numbers.in.range.ii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TotalWavinessOfNumbersInRangeIIProblemTest {
    private final TotalWavinessOfNumbersInRangeIIProblem2 problem = new TotalWavinessOfNumbersInRangeIIProblem2();

    void example1() {
        // Input: num1 = 120, num2 = 130
        // Output: 3
        long num1 = 120, num2 = 130;

        long out = problem.totalWaviness(num1, num2);

        assertEquals(3, out);
    }

    @Test
    void example2() {
        // Input: num1 = 198, num2 = 202
        // Output: 3
        long num1 = 198, num2 = 202;

        long out = problem.totalWaviness(num1, num2);

        assertEquals(3, out);
    }

    @Test
    void example3() {
        // Input: num1 = 4848, num2 = 4848
        // Output: 2
        long num1 = 4848, num2 = 4848;

        long out = problem.totalWaviness(num1, num2);

        assertEquals(2, out);
    }

    @Test
    void failure1() {
        // num1 = 585
        // num2 = 714
        long num1 = 585, num2 = 714;

        long out = problem.totalWaviness(num1, num2);

        assertEquals(87, out);
    }
}
