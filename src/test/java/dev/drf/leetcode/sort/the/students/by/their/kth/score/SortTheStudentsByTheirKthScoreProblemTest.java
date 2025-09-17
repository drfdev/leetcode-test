package dev.drf.leetcode.sort.the.students.by.their.kth.score;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortTheStudentsByTheirKthScoreProblemTest {
    private final SortTheStudentsByTheirKthScoreProblem problem = new SortTheStudentsByTheirKthScoreProblem();

    @Test
    void example1() {
        // Input: score = [[10,6,9,1],[7,5,11,2],[4,8,3,15]], k = 2
        // Output: [[7,5,11,2],[10,6,9,1],[4,8,3,15]]
        int[][] score = {
                {10, 6, 9, 1},
                {7, 5, 11, 2},
                {4, 8, 3, 15}
        };
        int k = 2;

        var out = problem.sortTheStudents(score, k);

        int[][] expected = {
                {7, 5, 11, 2},
                {10, 6, 9, 1},
                {4, 8, 3, 15}
        };
        assertArrayEquals(expected, out);
    }

    @Test
    void example2() {
        // Input: score = [[3,4],[5,6]], k = 0
        // Output: [[5,6],[3,4]]
        int[][] score = {
                {3, 4},
                {5, 6}
        };
        int k = 0;

        var out = problem.sortTheStudents(score, k);

        int[][] expected = {
                {5, 6},
                {3, 4}
        };
        assertArrayEquals(expected, out);
    }
}
