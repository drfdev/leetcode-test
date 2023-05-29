package dev.drf.leetcode.delete.node.in.a.bst;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/delete-node-in-a-bst/
 */
@Deprecated
public class DeleteNodeInABstProblem implements Problem {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (root.val == key) {
            return root.left == null ? root.right : root.left;
        }
        findAndRemove(root, null, null, key);

        return root;
    }

    private boolean findAndRemove(TreeNode node, Side side, TreeNode previous, int key) {
        if (node == null) {
            return false;
        }

        if (node.val == key) {
            // REMOVE
            if (previous != null && side != null) {
                TreeNode replaceNode = null;
                if (node.left != null && node.right != null) {
                    // TODO WTF ??
                } else if (node.left != null) {
                    replaceNode = node.left;
                } else if (node.right != null) {
                    replaceNode = node.right;
                }

                if (side == Side.LEFT) {
                    previous.left = replaceNode;
                } else {
                    // side == Side.RIGHT
                    previous.right = replaceNode;
                }

                return true;
            }
        }

        var leftBool = findAndRemove(node.left, Side.LEFT, node, key);
        if (leftBool) {
            return true;
        }
        var rightBool = findAndRemove(node.right, Side.RIGHT, node, key);
        if (rightBool) {
            return true;
        }

        return false;
    }

    private enum Side {
        LEFT, RIGHT
    }
}
