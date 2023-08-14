package dev.drf.leetcode.path.sum;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/path-sum/
 */
public class PathSumProblem implements Problem {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSumByNode(root, 0, targetSum);
    }

    private boolean hasPathSumByNode(TreeNode node, int current, int target) {
        if (node == null) {
            return false;
        }

        int sum = current + node.val;
        if (isLeaf(node)) {
            return target == sum;
        }

        boolean hasLeft = hasPathSumByNode(node.left, sum, target);
        boolean hasRight = hasPathSumByNode(node.right, sum, target);

        return hasLeft || hasRight;
    }

    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
