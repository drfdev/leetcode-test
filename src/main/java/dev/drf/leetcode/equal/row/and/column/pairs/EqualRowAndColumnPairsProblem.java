package dev.drf.leetcode.equal.row.and.column.pairs;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/equal-row-and-column-pairs/
 */
public class EqualRowAndColumnPairsProblem implements Problem {
    public int equalPairs(int[][] grid) {
        if (grid == null) {
            return 0;
        }

        final int n = grid.length;

        Map<Integer, List<Integer>> columns = new HashMap<>(n, 1.0f);
        Map<Integer, List<Integer>> rows = new HashMap<>(n, 1.0f);

        // by columns
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += grid[j][i];
            }

            List<Integer> columnNums = columns.get(sum);
            if (columnNums == null) {
                columnNums = new ArrayList<>();
                columns.put(sum, columnNums);
            }
            columnNums.add(i);
        }

        // by rows
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += grid[i][j];
            }

            List<Integer> rowNums = rows.get(sum);
            if (rowNums == null) {
                rowNums = new ArrayList<>();
                rows.put(sum, rowNums);
            }
            rowNums.add(i);
        }

        int count = 0;
        for (Map.Entry<Integer, List<Integer>> rowEntry : rows.entrySet()) {
            Integer key = rowEntry.getKey();
            List<Integer> rowList = rowEntry.getValue();

            List<Integer> columnList = columns.get(key);

            if (columnList != null) {
                for (Integer romNum : rowList) {
                    loop: for (Integer columnNum : columnList) {
                        for (int i = 0; i < n; i++) {
                            int rowValue = grid[romNum][i];
                            int columnValue = grid[i][columnNum];

                            if (rowValue != columnValue) {
                                continue loop;
                            }
                        }
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
