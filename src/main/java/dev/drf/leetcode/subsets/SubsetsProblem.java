package dev.drf.leetcode.subsets;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/subsets/
 * Used solution:
 * https://www.youtube.com/watch?v=REOH22Xwdkk
 */
public class SubsetsProblem implements Problem {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(result, 0, nums, list);
        return result;
    }

    private void backtrack(List<List<Integer>> result,
                           int start,
                           int[] nums,
                           List<Integer> list) {
        if (start >= nums.length) {
            result.add(new ArrayList<>(list));
        } else {
            list.add(nums[start]);
            backtrack(result, start + 1, nums, list);

            list.remove(list.size() - 1);
            backtrack(result, start + 1, nums, list);
        }
    }


}
