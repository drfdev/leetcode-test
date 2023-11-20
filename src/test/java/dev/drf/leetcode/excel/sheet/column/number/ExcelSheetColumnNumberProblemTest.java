package dev.drf.leetcode.excel.sheet.column.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExcelSheetColumnNumberProblemTest {
    private final ExcelSheetColumnNumberProblem problem = new ExcelSheetColumnNumberProblem();

    @Test
    void example1() {
        /*
        Input: columnTitle = "A"
        Output: 1
         */
        var columnTitle = "A";

        var result = problem.titleToNumber(columnTitle);

        assertEquals(1, result);
    }

    @Test
    void example2() {
        /*
        Input: columnTitle = "AB"
        Output: 28
         */
        var columnTitle = "AB";

        var result = problem.titleToNumber(columnTitle);

        assertEquals(28, result);
    }

    @Test
    void example3() {
        /*
        Input: columnTitle = "ZY"
        Output: 701
         */
        var columnTitle = "ZY";

        var result = problem.titleToNumber(columnTitle);

        assertEquals(701, result);
    }
}
