package dev.drf.leetcode.add.digits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddDigitsProblemTest {
    private final AddDigitsProblem problem = new AddDigitsProblem();

    @Test
    void example1() {
        /*
        Input: num = 38
        Output: 2
         */
        int num = 38;

        var res = problem.addDigits(num);

        assertEquals(2, res);
    }

    @Test
    void example2() {
        /*
        Input: num = 0
        Output: 0
         */
        int num = 0;

        var res = problem.addDigits(num);

        assertEquals(0, res);
    }
}
