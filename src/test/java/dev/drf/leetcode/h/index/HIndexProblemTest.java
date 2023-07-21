package dev.drf.leetcode.h.index;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HIndexProblemTest {
    private final HIndexProblem problem = new HIndexProblem();

    @Test
    void example1() {
        /*
        Input: citations = [3,0,6,1,5]
        Output: 3
         */
        int[] citations = new int[]{
                3, 0, 6, 1, 5
        };

        int hIndex = problem.hIndex(citations);

        assertEquals(3, hIndex);
    }

    @Test
    void example2() {
        /*
        Input: citations = [1,3,1]
        Output: 1
         */
        int[] citations = new int[]{
                1, 3, 1
        };

        int hIndex = problem.hIndex(citations);

        assertEquals(1, hIndex);
    }

    @Test
    void failed1() {
        // citations = [0]
        int[] citations = new int[]{
                0
        };

        int hIndex = problem.hIndex(citations);

        assertEquals(0, hIndex);
    }
}
