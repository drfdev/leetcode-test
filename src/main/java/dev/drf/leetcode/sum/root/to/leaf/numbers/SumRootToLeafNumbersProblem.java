package dev.drf.leetcode.sum.root.to.leaf.numbers;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/sum-root-to-leaf-numbers/
 */
public class SumRootToLeafNumbersProblem implements Problem {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int prev) {
        if (node == null) {
            return 0;
        }

        prev = prev * 10 + node.val;
        int leftSum = dfs(node.left, prev);
        int rightSum = dfs(node.right, prev);

        int sum = leftSum + rightSum;

        if (sum == 0) {
            return prev;
        }
        return sum;
    }
}
