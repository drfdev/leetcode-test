package dev.drf.leetcode.random.pick.index;

import dev.drf.leetcode.Problem;

import java.util.*;

/**
 * https://leetcode.com/problems/random-pick-index/
 */
public class RandomPickIndexProblem implements Problem {
    private final Map<Integer, List<Integer>> indices = new HashMap<>();

    public RandomPickIndexProblem(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (!indices.containsKey(nums[i])) {
                indices.put(nums[i], new ArrayList<>());
            }
            indices.get(nums[i]).add(i);
        }
    }

    public int pick(int target) {
        Random random = new Random();

        if (indices.containsKey(target)) {
            List<Integer> targetIndices = indices.get(target);
            int randomIndex = random.nextInt(targetIndices.size());
            return targetIndices.get(randomIndex);
        }

        return -1;
    }

    /**
     * Your Solution object will be instantiated and called as such:
     * Solution obj = new Solution(nums);
     * int param_1 = obj.pick(target);
     */
}
