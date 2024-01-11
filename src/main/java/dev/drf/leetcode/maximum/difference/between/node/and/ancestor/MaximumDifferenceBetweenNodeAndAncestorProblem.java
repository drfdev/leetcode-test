package dev.drf.leetcode.maximum.difference.between.node.and.ancestor;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/
 */
public class MaximumDifferenceBetweenNodeAndAncestorProblem implements Problem {
    public int maxAncestorDiff(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return maxMaxMinDiff(root, root.val, root.val);
    }

    private int maxMaxMinDiff(TreeNode node, int min, int max) {
        final int diff = Math.abs(max - min);

        if (node == null) {
            return diff;
        }

        int leftDiff = 0;
        int rightDiff = 0;

        TreeNode left = node.left;
        TreeNode right = node.right;

        if (left != null) {
            int leftMin = Math.min(min, left.val);
            int leftMax = Math.max(max, left.val);

            leftDiff = maxMaxMinDiff(left, leftMin, leftMax);
        }

        if (right != null) {
            int rightMin = Math.min(min, right.val);
            int rightMax = Math.max(max, right.val);

            rightDiff = maxMaxMinDiff(right, rightMin, rightMax);
        }

        final int childDiff = Math.max(leftDiff, rightDiff);
        return Math.max(diff, childDiff);
    }
}
