package dev.drf.leetcode.minimum.absolute.difference.in.bst;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/minimum-absolute-difference-in-bst/
 * Used solution:
 * https://leetcode.com/problems/minimum-absolute-difference-in-bst/solutions/2835996/java-dfs/
 */
public class MinimumAbsoluteDifferenceInBstProblem implements Problem {
    private TreeNode prev;
    private Integer min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
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
