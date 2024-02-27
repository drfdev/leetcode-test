package dev.drf.leetcode.root.equals.sum.of.children;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/root-equals-sum-of-children/
 */
public class RootEqualsSumOfChildrenProblem implements Problem {
    public boolean checkTree(TreeNode root) {
        int rootValue = root.val;

        int leftValue = root.left.val;
        int rightValue = root.right.val;

        return rootValue == (leftValue + rightValue);
    }
}
