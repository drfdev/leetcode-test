package dev.drf.leetcode.cells.in.a.range.on.an.excel.sheet;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CellsInARangeOnAnExcelSheetProblemTest {
    private final CellsInARangeOnAnExcelSheetProblem problem = new CellsInARangeOnAnExcelSheetProblem();

    @Test
    void example1() {
        // Input: s = "K1:L2"
        // Output: ["K1","K2","L1","L2"]
        String s = "K1:L2";

        var list = problem.cellsInRange(s);

        var expected = List.of("K1", "K2", "L1", "L2");
        assertEquals(expected, list);
    }

    @Test
    void example2() {
        // Input: s = "A1:F1"
        // Output: ["A1","B1","C1","D1","E1","F1"]
        String s = "A1:F1";

        var list = problem.cellsInRange(s);

        var expected = List.of("A1", "B1", "C1", "D1", "E1", "F1");
        assertEquals(expected, list);
    }
}
