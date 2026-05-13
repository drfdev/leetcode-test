package dev.drf.leetcode.find.the.degree.of.each.vertex;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/find-the-degree-of-each-vertex/
 */
public class FindTheDegreeOfEachVertexProblem implements Problem {
    public int[] findDegrees(int[][] matrix) {
        final int size = matrix.length;
        final int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                // `matrix[i][j] = 1` indicates that there is an edge between vertices `i` and `j`
                if (matrix[i][j] == 1) {
                    result[i]++;
                    result[j]++;
                }
            }
        }

        return result;
    }
}
