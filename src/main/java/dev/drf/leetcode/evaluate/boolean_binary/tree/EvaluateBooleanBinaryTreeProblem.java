package dev.drf.leetcode.evaluate.boolean_binary.tree;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/evaluate-boolean-binary-tree/
 */
public class EvaluateBooleanBinaryTreeProblem implements Problem {
    public boolean evaluateTree(TreeNode root) {
        // 0 represents False and 1 represents True
        // 2 represents the boolean OR and 3 represents the boolean AND
        if (root.left != null && root.right != null) {
            boolean leftVal = evaluateTree(root.left);
            boolean rightVal = evaluateTree(root.right);
            if (root.val == 2) {
                return leftVal || rightVal;
            } else {
                return leftVal && rightVal;
            }
        } else {
            if (root.val == 0) {
                return false;
            } else {
                return true;
            }
        }
    }
}
