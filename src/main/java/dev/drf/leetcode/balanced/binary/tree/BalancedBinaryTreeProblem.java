package dev.drf.leetcode.balanced.binary.tree;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/balanced-binary-tree/
 * Used solutions:
 * https://leetcode.com/problems/balanced-binary-tree/solutions/2428871/very-easy-100-fully-explained-c-java-python-javascript-python3/
 * https://leetcode.com/problems/balanced-binary-tree/solutions/3315406/java-solution-beats-95-33/
 */
public class BalancedBinaryTreeProblem implements Problem {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        return maxDepth(root) != -1;
    }

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        if (leftDepth == -1 || rightDepth == -1) {
            return -1;
        }
        if (Math.abs(leftDepth - rightDepth) > 1) {
            return -1;
        }
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
