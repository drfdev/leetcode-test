package dev.drf.leetcode.pascals.triangle;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle/
 */
public class PascalsTriangleProblem implements Problem {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            if (row == 0) {
                result.add(List.of(1));
            } else if (row == 1) {
                result.add(List.of(1, 1));
            } else {
                int size = row + 1;
                List<Integer> rowValues = new ArrayList<>(size);
                List<Integer> previousRow = result.get(row - 1);

                for (int i = 0; i < size; i++) {
                    if (i == 0 || i == row) {
                        rowValues.add(1);
                    } else {
                        int left = previousRow.get(i - 1);
                        int right = previousRow.get(i);

                        rowValues.add(left + right);
                    }
                }

                result.add(rowValues);
            }
        }

        return result;
    }
}
