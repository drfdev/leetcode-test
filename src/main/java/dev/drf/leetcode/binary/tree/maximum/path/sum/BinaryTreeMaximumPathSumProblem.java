package dev.drf.leetcode.binary.tree.maximum.path.sum;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/binary-tree-maximum-path-sum/
 * Used solution:
 * https://www.youtube.com/watch?v=Hr5cWUld4vU
 */
public class BinaryTreeMaximumPathSumProblem implements Problem {
    public int maxPathSum(TreeNode root) {
        int[] res = {Integer.MIN_VALUE};
        maxPathSum(root, res);
        return res[0];
    }

    private int maxPathSum(TreeNode root, int[] res) {
        if (root == null) {
            return 0;
        }

        int left = Math.max(0, maxPathSum(root.left, res));
        int right = Math.max(0, maxPathSum(root.right, res));

        res[0] = Math.max(res[0], root.val + left + right);

        return root.val + Math.max(left, right);
    }
}
