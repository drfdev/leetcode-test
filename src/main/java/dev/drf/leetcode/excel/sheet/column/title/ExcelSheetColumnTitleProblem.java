package dev.drf.leetcode.excel.sheet.column.title;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/excel-sheet-column-title/
 */
public class ExcelSheetColumnTitleProblem implements Problem {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 26) {
            var num = columnNumber % 26;
            if (num == 0) {
                num = 26;
                columnNumber -= 26;
            }
            char ch = (char) ('A' + num - 1);
            sb.append(ch);
            columnNumber = columnNumber / 26;
        }

        char ch = (char) ('A' + columnNumber - 1);
        sb.append(ch);

        return sb.reverse()
                .toString();
    }
}
