package dev.drf.leetcode.maximum.depth.of.binary.tree;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class MaximumDepthOfBinaryTreeProblem implements Problem {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return calculateMaxDepth(root);
    }

    private int calculateMaxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftDepth = calculateMaxDepth(node.left) + 1;
        int rightDepth = calculateMaxDepth(node.right) + 1;

        return Math.max(leftDepth, rightDepth);
    }
}
