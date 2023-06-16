package dev.drf.leetcode.invert.binary.tree;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/invert-binary-tree/
 */
public class InvertBinaryTreeProblem implements Problem {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        invertNode(root);

        return root;
    }

    private void invertNode(TreeNode node) {
        if (node == null) {
            return;
        }

        TreeNode left = node.left;
        TreeNode right = node.right;

        node.left = right;
        node.right = left;

        invertNode(left);
        invertNode(right);
    }
}
