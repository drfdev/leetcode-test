package dev.drf.leetcode.combination.sum.iii;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * https://leetcode.com/problems/combination-sum-iii/
 */
public class CombinationSumIIIProblem implements Problem {
    public List<List<Integer>> combinationSum3(int k, int n) {
        HashSet<List<Integer>> result = new HashSet<>();
        findAllCombinations(result, 0, k, n, new HashSet<>());
        return result.stream().toList();
    }

    private void findAllCombinations(HashSet<List<Integer>> result, int index, int k, int target, HashSet<Integer> previous) {
        if (index == k) {
            return;
        }

        final int nextIndex = (index + 1);
        for (int val = 1; val <= target && val <= 9; val++) {
            if (previous.contains(val)) {
                continue;
            }
            int iRes = target - val;
            if (iRes == 0) {
                if (nextIndex == k) {
                    List<Integer> currentResult = new ArrayList<>(previous);
                    currentResult.add(val);
                    currentResult.sort(Integer::compareTo);
                    result.add(currentResult);
                }
                continue;
            }
            if (target - val >= 0) {
                HashSet<Integer> previous0 = new HashSet<>(previous);
                previous0.add(val);
                findAllCombinations(result, nextIndex, k, (target - val), previous0);
            }
        }
    }
}
