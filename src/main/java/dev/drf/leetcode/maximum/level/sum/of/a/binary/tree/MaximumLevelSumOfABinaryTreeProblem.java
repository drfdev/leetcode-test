package dev.drf.leetcode.maximum.level.sum.of.a.binary.tree;

import dev.drf.leetcode.Problem;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/
 */
public class MaximumLevelSumOfABinaryTreeProblem implements Problem {
    public int maxLevelSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        var levelSums = new HashMap<Integer, Counter>();
        calculateLevelSums(root, levelSums, 1);

        long maxSum = Long.MIN_VALUE;
        int minLevel = 0;
        for (Map.Entry<Integer, Counter> entry : levelSums.entrySet()) {
            int level = entry.getKey();
            long sum = entry.getValue().sum;

            if (maxSum < sum) {
                maxSum = sum;
                minLevel = level;
            } else if (maxSum == sum) {
                minLevel = Math.min(level, minLevel);
            }
        }

        return minLevel;
    }

    private void calculateLevelSums(TreeNode node, HashMap<Integer, Counter> sums, int level) {
        if (node == null) {
            return;
        }

        var counter = sums.get(level);
        if (counter == null) {
            counter = new Counter();
            sums.put(level, counter);
        }

        counter.sum += node.val;

        calculateLevelSums(node.left, sums, level + 1);
        calculateLevelSums(node.right, sums, level + 1);
    }

    private static class Counter {
        private long sum = 0;
    }
}
