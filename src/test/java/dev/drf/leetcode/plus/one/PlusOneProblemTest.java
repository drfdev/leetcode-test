package dev.drf.leetcode.plus.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlusOneProblemTest {
    private final PlusOneProblem problem = new PlusOneProblem();

    private static void assertArray(int[] res, int... digits) {
        assertEquals(res.length, digits.length);
        for (int i = 0; i < res.length; i++) {
            assertEquals(digits[i], res[i]);
        }
    }

    @Test
    void example1() {
        /*
        Input: digits = [1,2,3]
        Output: [1,2,4]
         */
        int[] digits = new int[]{1, 2, 3};

        var res = problem.plusOne(digits);

        assertArray(res, 1, 2, 4);
    }

    @Test
    void example2() {
        /*
        Input: digits = [4,3,2,1]
        Output: [4,3,2,2]
         */
        int[] digits = new int[]{4, 3, 2, 1};

        var res = problem.plusOne(digits);

        assertArray(res, 4, 3, 2, 2);
    }

    @Test
    void example3() {
        /*
        Input: digits = [9]
        Output: [1,0]
         */
        int[] digits = new int[]{9};

        var res = problem.plusOne(digits);

        assertArray(res, 1, 0);
    }

    @Test
    void myTest1() {
        int[] digits = new int[]{9, 9, 9, 9, 9};

        var res = problem.plusOne(digits);

        assertArray(res, 1, 0, 0, 0, 0, 0);
    }
}
