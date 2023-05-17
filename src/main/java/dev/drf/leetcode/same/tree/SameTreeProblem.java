package dev.drf.leetcode.same.tree;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/same-tree/
 */
public class SameTreeProblem implements Problem {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }

        return isEqualsNode(p, q);
    }

    private boolean isEqualsNode(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        }
        return left.val == right.val
                && isEqualsNode(left.left, right.left)
                && isEqualsNode(left.right, right.right);
    }
}
