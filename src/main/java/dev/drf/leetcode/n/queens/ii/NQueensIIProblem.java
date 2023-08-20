package dev.drf.leetcode.n.queens.ii;

import dev.drf.leetcode.Problem;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/n-queens-ii/
 */
public class NQueensIIProblem implements Problem {
    public int totalNQueens(int n) {
        Set<Integer> col = new HashSet<>();
        Set<Integer> diagUp = new HashSet<>(); // (r + c)
        Set<Integer> diagDown = new HashSet<>(); // (r - c)

        Counter res = new Counter();
        dfs(res, 0, n, col, diagUp, diagDown);
        return res.value;
    }

    private void dfs(Counter res,
                     int row,
                     int n,
                     Set<Integer> col,
                     Set<Integer> diagUp,
                     Set<Integer> diagDown) {
        if (row == n) {
            res.value++;
            return;
        }
        for (int i = 0; i < n; i++) {
            if (col.contains(i) || diagUp.contains(row + i) || diagDown.contains(row - i)) {
                continue;
            }

            col.add(i);
            diagUp.add(row + i);
            diagDown.add(row - i);

            dfs(res, row + 1, n, col, diagUp, diagDown);

            col.remove(i);
            diagUp.remove(row + i);
            diagDown.remove(row - i);
        }
    }

    private static class Counter {
        int value = 0;
    }
}
