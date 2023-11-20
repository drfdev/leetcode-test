package dev.drf.leetcode.excel.sheet.column.number;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/excel-sheet-column-number/
 */
public class ExcelSheetColumnNumberProblem implements Problem {
    public int titleToNumber(String columnTitle) {
        if (columnTitle == null) {
            return 0;
        }

        char[] arr = columnTitle.toCharArray();
        final int size = arr.length;
        int result = 0;
        int multiplicator = 1;

        for (int i = size - 1; i >= 0; i--) {
            char current = arr[i];
            int value = current - 'A' + 1;
            result += value * multiplicator;
            multiplicator = multiplicator * 26;
        }

        return result;
    }
}
