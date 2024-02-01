package dev.drf.leetcode.combinations;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/combinations/
 * Used solution:
 * https://leetcode.com/problems/combinations/solutions/27002/backtracking-solution-java/comments/189155
 */
public class CombinationsProblem implements Problem {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), n, k, 1);
        return res;
    }

    private void backtrack(List<List<Integer>> res,
                           List<Integer> tempList,
                           int n, int k, int num) {
        if (tempList.size() == k) {
            res.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = num; i <= n; i++) {
            tempList.add(i);
            backtrack(res, tempList, n, k, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
