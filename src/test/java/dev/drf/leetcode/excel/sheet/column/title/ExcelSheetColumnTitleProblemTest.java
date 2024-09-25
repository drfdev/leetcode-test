package dev.drf.leetcode.excel.sheet.column.title;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExcelSheetColumnTitleProblemTest {
    private final ExcelSheetColumnTitleProblem problem = new ExcelSheetColumnTitleProblem();

    @Test
    void example1() {
        /*
        Input: columnNumber = 1
        Output: "A"
         */
        int columnNumber = 1;

        var sheet = problem.convertToTitle(columnNumber);

        assertEquals("A", sheet);
    }

    @Test
    void example2() {
        /*
        Input: columnNumber = 28
        Output: "AB"
         */
        int columnNumber = 28;

        var sheet = problem.convertToTitle(columnNumber);

        assertEquals("AB", sheet);
    }

    @Test
    void example3() {
        /*
        Input: columnNumber = 701
        Output: "ZY"
         */
        int columnNumber = 701;

        var sheet = problem.convertToTitle(columnNumber);

        assertEquals("ZY", sheet);
    }

    @Test
    void failure1() {
        // 52
        // AZ
        int columnNumber = 52;

        var sheet = problem.convertToTitle(columnNumber);

        assertEquals("AZ", sheet);
    }
}
