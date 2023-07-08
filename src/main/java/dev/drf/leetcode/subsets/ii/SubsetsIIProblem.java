package dev.drf.leetcode.subsets.ii;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/subsets-ii/
 * Used solution:
 * https://www.youtube.com/watch?v=Vn2v6ajA7U0
 */
public class SubsetsIIProblem implements Problem {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(result, 0, nums, list);
        return result;
    }

    private void backtrack(List<List<Integer>> result,
                           int idx,
                           int[] nums,
                           List<Integer> list) {
        result.add(new ArrayList<>(list));

        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1]) {
                continue;
            }
            list.add(nums[i]);
            backtrack(result, i + 1, nums, list);
            list.remove(list.size() - 1);
        }
    }
}
