package dev.drf.leetcode.valid.sudoku;

import dev.drf.leetcode.Problem;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/valid-sudoku/
 */
public class ValidSudokuProblem implements Problem {
    public boolean isValidSudoku(char[][] board) {
        SudokuBlock[] rows = new SudokuBlock[9];
        SudokuBlock[] columns = new SudokuBlock[9];
        SudokuBlock[] boxes = new SudokuBlock[9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char value = board[r][c];

                if (value == '.') {
                    continue;
                }

                // for row
                if (rows[r] == null) {
                    rows[r] = new SudokuBlock();
                }
                var rowBlock = rows[r];
                var added = rowBlock.blockValues.add(value);

                if (!added) {
                    return false;
                }

                // for cell
                if (columns[c] == null) {
                    columns[c] = new SudokuBlock();
                }
                var columnBlock = columns[c];
                added = columnBlock.blockValues.add(value);

                if (!added) {
                    return false;
                }

                // for box
                int boxIndex = 3 * (r / 3) + (c / 3);

                if (boxes[boxIndex] == null) {
                    boxes[boxIndex] = new SudokuBlock();
                }
                var boxBlock = boxes[boxIndex];
                added = boxBlock.blockValues.add(value);

                if (!added) {
                    return false;
                }
            }
        }

        return true;
    }

    private static class SudokuBlock {
        private final Set<Character> blockValues = new HashSet<>(9);
    }
}
