package dev.drf.leetcode.delete.node.in.a.bst;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/delete-node-in-a-bst/
 * Used solution:
 * https://leetcode.com/problems/delete-node-in-a-bst/solutions/1590868/java-recursive-most-intutive-proper-explanation-using-image/
 */
public class DeleteNodeInABstProblem2 implements Problem {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
            return root;
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
            return root;
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                TreeNode min = root.right;
                while (min.left != null) {
                    min = min.left;
                }

                root.val = min.val;
                root.right = deleteNode(root.right, min.val);
                return root;
            }
        }
    }
}
