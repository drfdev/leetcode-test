package dev.drf.leetcode.combination.sum.ii;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/combination-sum-ii/
 * Used solution:
 * https://www.youtube.com/watch?v=rSA3t6BDDwg
 */
public class CombinationSumIIProblem implements Problem {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        backtrack(candidates, target, ans, ls, 0);
        return ans;
    }

    public void backtrack(int[] candidates,
                          int target,
                          List<List<Integer>> ans,
                          List<Integer> ls,
                          int index) {
        if (target == 0) {
            ans.add(new ArrayList<>(ls));
        } else if (target < 0) {
            return;
        } else {
            for (int i = index; i < candidates.length; i++) {
                if (i > index && candidates[i] == candidates[i - 1]) {
                    continue;
                }
                ls.add(candidates[i]);
                backtrack(candidates, target - candidates[i], ans, ls, i + 1);
                ls.remove(ls.get(ls.size() - 1));
            }
        }
    }
}
