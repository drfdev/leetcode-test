package dev.drf.leetcode.rank.transform.of.an.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RankTransformOfAnArrayProblemTest {
    private final RankTransformOfAnArrayProblem problem = new RankTransformOfAnArrayProblem();

    @Test
    void example1() {
        /*
        Input: arr = [40,10,20,30]
        Output: [4,1,2,3]
         */
        int[] arr = {40, 10, 20, 30};

        var res = problem.arrayRankTransform(arr);

        int[] expected = {4, 1, 2, 3};
        assertArrayEquals(expected, res);
    }

    @Test
    void example2() {
        /*
        Input: arr = [100,100,100]
        Output: [1,1,1]
         */
        int[] arr = {100, 100, 100};

        var res = problem.arrayRankTransform(arr);

        int[] expected = {1, 1, 1};
        assertArrayEquals(expected, res);
    }

    @Test
    void example3() {
        /*
        Input: arr = [37,12,28,9,100,56,80,5,12]
        Output: [5,3,4,2,8,6,7,1,3]
         */
        int[] arr = {37, 12, 28, 9, 100, 56, 80, 5, 12};

        var res = problem.arrayRankTransform(arr);

        int[] expected = {5, 3, 4, 2, 8, 6, 7, 1, 3};
        assertArrayEquals(expected, res);
    }
}
