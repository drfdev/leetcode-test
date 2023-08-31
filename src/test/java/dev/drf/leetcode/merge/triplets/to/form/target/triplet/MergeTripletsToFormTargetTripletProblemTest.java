package dev.drf.leetcode.merge.triplets.to.form.target.triplet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MergeTripletsToFormTargetTripletProblemTest {
    private final MergeTripletsToFormTargetTripletProblem problem = new MergeTripletsToFormTargetTripletProblem();

    @Test
    void example1() {
        /*
        Input: triplets = [[2,5,3],[1,8,4],[1,7,5]], target = [2,7,5]
        Output: true
         */
        int[][] triplets = new int[][]{
                {2, 5, 3}, {1, 8, 4}, {1, 7, 5}
        };
        int[] target = new int[]{
                2, 7, 5
        };

        var canDo = problem.mergeTriplets(triplets, target);

        assertTrue(canDo);
    }

    @Test
    void example2() {
        /*
        Input: triplets = [[3,4,5],[4,5,6]], target = [3,2,5]
        Output: false
         */
        int[][] triplets = new int[][]{
                {3, 4, 5}, {4, 5, 6}
        };
        int[] target = new int[]{
                3, 2, 5
        };

        var canDo = problem.mergeTriplets(triplets, target);

        assertFalse(canDo);
    }

    @Test
    void example3() {
        /*
        Input: triplets = [[2,5,3],[2,3,4],[1,2,5],[5,2,3]], target = [5,5,5]
        Output: true
         */
        int[][] triplets = new int[][]{
                {2, 5, 3}, {2, 3, 4}, {1, 2, 5}, {5, 2, 3}
        };
        int[] target = new int[]{
                5, 5, 5
        };

        var canDo = problem.mergeTriplets(triplets, target);

        assertTrue(canDo);
    }
}
