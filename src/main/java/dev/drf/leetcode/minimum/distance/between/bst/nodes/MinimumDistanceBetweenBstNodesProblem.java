package dev.drf.leetcode.minimum.distance.between.bst.nodes;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/minimum-distance-between-bst-nodes/
 * Same:
 * dev.drf.leetcode.minimum.absolute.difference.in.bst.MinimumAbsoluteDifferenceInBstProblem
 */
public class MinimumDistanceBetweenBstNodesProblem implements Problem {
    private TreeNode prev;
    private Integer min = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        dfs(root);
        return min;
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.left);

        if (prev != null) {
            min = Math.min(min, node.val - prev.val);
        }

        prev = node;
        dfs(node.right);
    }
}
