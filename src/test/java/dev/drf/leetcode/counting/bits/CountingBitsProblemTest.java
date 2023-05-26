package dev.drf.leetcode.counting.bits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingBitsProblemTest {
    private final CountingBitsProblem problem = new CountingBitsProblem();

    @Test
    void example1() {
        /*
        Input: n = 2
        Output: [0,1,1]
         */
        int n = 2;

        var arr = problem.countBits(n);

        assertEquals(n + 1, arr.length);
        assertEquals(0, arr[0]);
        assertEquals(1, arr[1]);
        assertEquals(1, arr[2]);
    }

    @Test
    void example2() {
        /*
        Input: n = 5
        Output: [0,1,1,2,1,2]
         */
        int n = 5;

        var arr = problem.countBits(n);

        assertEquals(n + 1, arr.length);
        assertEquals(0, arr[0]);
        assertEquals(1, arr[1]);
        assertEquals(1, arr[2]);
        assertEquals(2, arr[3]);
        assertEquals(1, arr[4]);
        assertEquals(2, arr[5]);
    }

    @Test
    void failed1() {
        // n = 0
        int n = 0;

        var arr = problem.countBits(n);

        assertEquals(n + 1, arr.length);
        assertEquals(0, arr[0]);
    }
}
