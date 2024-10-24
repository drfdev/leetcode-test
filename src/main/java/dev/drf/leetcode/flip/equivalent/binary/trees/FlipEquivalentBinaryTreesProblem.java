package dev.drf.leetcode.flip.equivalent.binary.trees;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/flip-equivalent-binary-trees/
 */
public class FlipEquivalentBinaryTreesProblem implements Problem {

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        return flipEquivRecursive(root1, root2) == 0;
    }

    private int flipEquivRecursive(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return 0;
        }
        if (left == null || right == null) {
            return 2;
        }

        var leftValue = left.val;
        var rightValue = right.val;
        if (leftValue != rightValue) {
            return 2;
        }

        var llEquiv = flipEquivRecursive(left.left, right.left);
        var rrEquiv = flipEquivRecursive(left.right, right.right);

        var rlEquiv = flipEquivRecursive(left.right, right.left);
        var lrEquiv = flipEquivRecursive(left.left, right.right);

        if ((llEquiv == 0 && rrEquiv == 0)
                || (lrEquiv == 0 && rlEquiv == 0)) {
            return 0;
        }

        return 2;
    }
}
