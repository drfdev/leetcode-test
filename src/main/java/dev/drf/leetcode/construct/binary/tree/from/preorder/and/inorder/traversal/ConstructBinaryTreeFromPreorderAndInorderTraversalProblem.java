package dev.drf.leetcode.construct.binary.tree.from.preorder.and.inorder.traversal;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * Used solution:
 * https://www.youtube.com/watch?v=ihj4IQGZ2zc
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversalProblem implements Problem {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);
        int mid = 0;

        for (int i = 0; i < inorder.length; i++) {
            if (preorder[0] == inorder[i]) {
                mid = i;
            }
        }

        root.left =
                buildTree(
                        Arrays.copyOfRange(preorder, 1, mid + 1),
                        Arrays.copyOfRange(inorder, 0, mid)
                );
        root.right =
                buildTree(
                        Arrays.copyOfRange(preorder, mid + 1, preorder.length),
                        Arrays.copyOfRange(inorder, mid + 1, inorder.length)
                );

        return root;
    }
}
