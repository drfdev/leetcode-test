package dev.drf.leetcode.search.a2d.matrix.ii;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/search-a-2d-matrix-ii/
 * used solution:
 * https://leetcode.com/problems/search-a-2d-matrix-ii/solutions/66140/my-concise-o-m-n-java-solution/
 */
public class SearchA2dMatrixIIProblem implements Problem {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return false;
        }
        int col = matrix[0].length - 1;
        int row = 0;
        while (col >= 0 && row <= matrix.length - 1) {
            if (target == matrix[row][col]) {
                return true;
            } else if (target < matrix[row][col]) {
                col--;
            } else if (target > matrix[row][col]) {
                row++;
            }
        }
        return false;
    }
}
