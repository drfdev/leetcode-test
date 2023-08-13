package dev.drf.leetcode.n.queens;

import dev.drf.leetcode.Problem;

import java.util.*;

/**
 * https://leetcode.com/problems/n-queens/
 * Used solution:
 * https://www.youtube.com/watch?v=Ph95IHmRp5M
 */
public class NQueensProblem implements Problem {
    public List<List<String>> solveNQueens(int n) {
        Set<Integer> col = new HashSet<>();
        Set<Integer> diagUp = new HashSet<>(); // (r + c)
        Set<Integer> diagDown = new HashSet<>(); // (r - c)

        List<List<String>> res = new ArrayList<>();
        dfs(res, new ArrayList<>(), 0, n, col, diagUp, diagDown);
        return res;
    }

    private void dfs(List<List<String>> res,
                     List<String> list,
                     int row,
                     int n,
                     Set<Integer> col,
                     Set<Integer> diagUp,
                     Set<Integer> diagDown) {
        if (row == n) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (col.contains(i) || diagUp.contains(row + i) || diagDown.contains(row - i)) {
                continue;
            }

            char[] charArray = new char[n];
            Arrays.fill(charArray, '.');
            charArray[i] = 'Q';
            String rowString = new String(charArray);

            list.add(rowString);
            col.add(i);
            diagUp.add(row + i);
            diagDown.add(row - i);

            dfs(res, list, row + 1, n, col, diagUp, diagDown);

            list.remove(list.size() - 1);
            col.remove(i);
            diagUp.remove(row + i);
            diagDown.remove(row - i);
        }
    }
}
