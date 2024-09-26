package dev.drf.leetcode.merge.similar.items;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSimilarItemsProblemTest {
    private final MergeSimilarItemsProblem problem = new MergeSimilarItemsProblem();

    @Test
    void example1() {
        /*
        Input: items1 = [[1,1],[4,5],[3,8]], items2 = [[3,1],[1,5]]
        Output: [[1,6],[3,9],[4,5]]
         */
        int[][] items1 = {
                {1, 1},
                {4, 5},
                {3, 8}
        };
        int[][] items2 = {
                {3, 1},
                {1, 5}
        };

        var result = problem.mergeSimilarItems(items1, items2);

        List<List<Integer>> expected = List.of(
                List.of(1, 6),
                List.of(3, 9),
                List.of(4, 5)
        );
        assertEquals(expected, result);
    }

    @Test
    void example2() {
        /*
        Input: items1 = [[1,1],[3,2],[2,3]], items2 = [[2,1],[3,2],[1,3]]
        Output: [[1,4],[2,4],[3,4]]
         */
        int[][] items1 = {
                {1, 1},
                {3, 2},
                {2, 3}
        };
        int[][] items2 = {
                {2, 1},
                {3, 2},
                {1, 3}
        };

        var result = problem.mergeSimilarItems(items1, items2);

        List<List<Integer>> expected = List.of(
                List.of(1, 4),
                List.of(2, 4),
                List.of(3, 4)
        );
        assertEquals(expected, result);
    }

    @Test
    void example3() {
        /*
        Input: items1 = [[1,3],[2,2]], items2 = [[7,1],[2,2],[1,4]]
        Output: [[1,7],[2,4],[7,1]]
         */
        int[][] items1 = {
                {1, 3},
                {2, 2}
        };
        int[][] items2 = {
                {7, 1},
                {2, 2},
                {1, 4}
        };

        var result = problem.mergeSimilarItems(items1, items2);

        List<List<Integer>> expected = List.of(
                List.of(1, 7),
                List.of(2, 4),
                List.of(7, 1)
        );
        assertEquals(expected, result);
    }
}
