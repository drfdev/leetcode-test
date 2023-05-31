package dev.drf.leetcode.number.of.provinces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfProvincesProblemTest {
    private final NumberOfProvincesProblem problem = new NumberOfProvincesProblem();

    @Test
    void example1() {
        /*
        Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
        Output: 2
         */
        int[][] isConnected = new int[][]{
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };

        int count = problem.findCircleNum(isConnected);

        assertEquals(2, count);
    }

    @Test
    void example2() {
        /*
        Input: isConnected = [[1,0,0],[0,1,0],[0,0,1]]
        Output: 3
         */
        int[][] isConnected = new int[][]{
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        int count = problem.findCircleNum(isConnected);

        assertEquals(3, count);
    }
}
