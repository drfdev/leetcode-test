package dev.drf.leetcode.candy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CandyProblemTest {
    private final CandyProblem problem = new CandyProblem();

    @Test
    void example1() {
        /*
        Input: ratings = [1,0,2]
        Output: 5
         */
        int[] ratings = new int[]{
                1, 0, 2
        };

        var count = problem.candy(ratings);

        assertEquals(5, count);
    }

    @Test
    void example2() {
        /*
        Input: ratings = [1,2,2]
        Output: 4
         */
        int[] ratings = new int[]{
                1, 2, 2
        };

        var count = problem.candy(ratings);

        assertEquals(4, count);
    }

    @Test
    void myTest1() {
        // 5,4,3,5,6,2
        // 3,2,1,2,3,1
        int[] ratings = new int[]{
                5, 4, 3, 5, 6, 2
        };

        var count = problem.candy(ratings);

        assertEquals(12, count);
    }
}
