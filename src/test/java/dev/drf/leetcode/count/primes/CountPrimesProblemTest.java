package dev.drf.leetcode.count.primes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountPrimesProblemTest {
    private final CountPrimesProblem problem = new CountPrimesProblem();

    @Test
    void example1() {
        /*
        Input: n = 10
        Output: 4
         */
        int n = 10;

        var count = problem.countPrimes(n);

        assertEquals(4, count);
    }

    @Test
    void example2() {
        /*
        Input: n = 0
        Output: 0
         */
        int n = 0;

        var count = problem.countPrimes(n);

        assertEquals(0, count);
    }

    @Test
    void example3() {
        /*
        Input: n = 1
        Output: 0
         */
        int n = 1;

        var count = problem.countPrimes(n);

        assertEquals(0, count);
    }

    @Test
    void failed1() {
        // n = 2
        int n = 2;

        var count = problem.countPrimes(n);

        assertEquals(0, count);
    }

    @Test
    void failed2() {
        // n = 3
        int n = 3;

        var count = problem.countPrimes(n);

        assertEquals(1, count);
    }
}
