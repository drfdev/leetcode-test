package dev.drf.leetcode.minimum.depth.of.binary.tree;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 */
public class MinimumDepthOfBinaryTreeProblem implements Problem {
    public int minDepth(TreeNode root) {
        return minDepthRecursive(root, 0);
    }

    private int minDepthRecursive(TreeNode node,
                                  int depth) {
        if (node == null) {
            return depth;
        }
        if (node.left == null && node.right == null) {
            return depth + 1;
        }

        int leftDepth = minDepthRecursive(node.left, depth + 1);
        int rightDepth = minDepthRecursive(node.right, depth + 1);

        if (node.left != null && node.right != null) {
            return Math.min(leftDepth, rightDepth);
        }
        if (node.left != null) {
            return leftDepth;
        }
        // if (node.right != null) {
        return rightDepth;
    }
}
