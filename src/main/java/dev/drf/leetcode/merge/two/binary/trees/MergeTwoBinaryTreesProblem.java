package dev.drf.leetcode.merge.two.binary.trees;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/merge-two-binary-trees/
 */
public class MergeTwoBinaryTreesProblem implements Problem {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }
        final int newValue = (root1 != null ? root1.val : 0)
                + (root2 != null ? root2.val : 0);
        TreeNode node = new TreeNode(newValue);
        node.left = mergeTrees(
                root1 != null ? root1.left : null,
                root2 != null ? root2.left : null
        );
        node.right = mergeTrees(
                root1 != null ? root1.right : null,
                root2 != null ? root2.right : null
        );
        return node;
    }
}
