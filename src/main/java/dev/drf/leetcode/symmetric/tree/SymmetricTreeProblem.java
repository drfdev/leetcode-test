package dev.drf.leetcode.symmetric.tree;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/symmetric-tree/
 */
public class SymmetricTreeProblem implements Problem {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }
        return isSymmetricNodes(root.left, root.right);
    }

    private boolean isSymmetricNodes(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val == right.val) {
            return isSymmetricNodes(left.left, right.right)
                    && isSymmetricNodes(left.right, right.left);
        }

        return false;
    }
}
