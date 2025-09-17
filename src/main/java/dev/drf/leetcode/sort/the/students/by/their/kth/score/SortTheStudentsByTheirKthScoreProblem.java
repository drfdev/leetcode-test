package dev.drf.leetcode.sort.the.students.by.their.kth.score;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/sort-the-students-by-their-kth-score/
 */
public class SortTheStudentsByTheirKthScoreProblem implements Problem {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (left, right) -> Integer.compare(right[k], left[k]));
        return score;
    }
}
