package dev.drf.leetcode.house.robber.iii;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/house-robber-iii/
 */
public class HouseRobberIIIProblem implements Problem {
    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int[] result = dfs(root);
        return Math.max(result[0], result[1]);
    }

    private int[] dfs(TreeNode node) {
        // [withNode, withoutNode]
        if (node.left == null && node.right == null) {
            return new int[]{node.val, 0};
        }

        int[] left = null;
        if (node.left != null) {
            left = dfs(node.left);
        }

        int[] right = null;
        if (node.right != null) {
            right = dfs(node.right);
        }

        int withNode = node.val
                + (left != null ? left[1] : 0)
                + (right != null ? right[1] : 0);
        int withoutNode = (left != null ? Math.max(left[0], left[1]) : 0)
                + (right != null ? Math.max(right[0], right[1]) : 0);

        return new int[]{withNode, withoutNode};
    }
}
