package dev.drf.leetcode.sum.of.subarray.minimums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfSubarrayMinimumsProblemTest {
//    private final SumOfSubarrayMinimumsProblem problem = new SumOfSubarrayMinimumsProblem();
    private final SumOfSubarrayMinimumsProblem2 problem = new SumOfSubarrayMinimumsProblem2();

    @Test
    void example1() {
        /*
        Input: arr = [3,1,2,4]
        Output: 17
         */
        int[] arr = new int[]{
                3, 1, 2, 4
        };

        int out = problem.sumSubarrayMins(arr);

        assertEquals(17, out);
    }

    @Test
    void example2() {
        /*
        Input: arr = [11,81,94,43,3]
        Output: 444
         */
        int[] arr = new int[]{
                11, 81, 94, 43, 3
        };

        int out = problem.sumSubarrayMins(arr);

        assertEquals(444, out);
    }
}
