package dev.drf.leetcode.count.complete.tree.nodes;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/count-complete-tree-nodes
 */
public class CountCompleteTreeNodesProblem implements Problem {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return nodeCount(root);
    }

    private int nodeCount(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int result = 1;

        int left = nodeCount(node.left);
        int right = nodeCount(node.right);

        return result + left + right;
    }
}
