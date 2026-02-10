package dev.drf.leetcode.cells.in.a.range.on.an.excel.sheet;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/
 */
public class CellsInARangeOnAnExcelSheetProblem implements Problem {
    public List<String> cellsInRange(String s) {
        /*
s.length == 5
'A' <= s[0] <= s[3] <= 'Z'
'1' <= s[1] <= s[4] <= '9'
         */
        final char firstColumn = s.charAt(0);
        final int firstRow = (s.charAt(1) - '1');
        final char lastColumn = s.charAt(3);
        final int lastRow = (s.charAt(4) - '1');

        int cellsSize = (lastRow - firstRow + 1) * (lastColumn - firstColumn + 1);

        List<String> result = new ArrayList<>(cellsSize);

        char column = firstColumn;
        var sb = new StringBuilder();

        for (; column <= lastColumn; column++) {
            for (int row = firstRow; row <= lastRow; row++) {
                sb.append(column);
                sb.append(row + 1);
                result.add(sb.toString());

                sb.delete(0, sb.length());
            }
        }

        return result;
    }
}
