package dev.drf.leetcode.pascals.triangle.ii;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle-ii/
 */
public class PascalsTriangleIIProblem implements Problem {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            return List.of(1);
        }
        if (rowIndex == 1) {
            return List.of(1, 1);
        }

        final int size = rowIndex + 1;
        List<Integer> previous = new ArrayList<>(size);
        List<Integer> current = new ArrayList<>(size);

        previous.add(1);
        previous.add(1);

        for (int row = 2; row < size; row++) {
            current.clear();
            for (int i = 0; i <= row; i++) {
                if (i == 0 || i == row) {
                    current.add(1);
                } else {
                    int left = previous.get(i - 1);
                    int right = previous.get(i);

                    current.add(left + right);
                }
            }
            previous.clear();
            previous.addAll(current);
        }

        return current;
    }
}
