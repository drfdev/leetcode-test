package dev.drf.leetcode.flatten.binary.tree.to.linked.list;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
 */
public class FlattenBinaryTreeToLinkedListProblem implements Problem {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten(root.left);
        flatten(root.right);

        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = null;
        root.right = left;

        if (left == null) {
            root.right = right;
            return;
        }

        TreeNode cursor = left;
        while (cursor.right != null) {
            cursor = cursor.right;
        }

        cursor.right = right;
    }
}
