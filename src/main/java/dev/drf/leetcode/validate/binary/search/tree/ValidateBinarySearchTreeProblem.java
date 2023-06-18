package dev.drf.leetcode.validate.binary.search.tree;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/validate-binary-search-tree/
 */
public class ValidateBinarySearchTreeProblem implements Problem {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        final int value = root.val;

        if (root.left != null) {
            int maxLeft = findMaxValue(root.left, root.left.val);
            if (!(maxLeft < value)) {
                return false;
            }
        }
        if (root.right != null) {
            int minRight = findMinValue(root.right, root.right.val);
            if (!(minRight > value)) {
                return false;
            }
        }

        return isValidBST(root.left) && isValidBST(root.right);
    }

    private int findMinValue(TreeNode node, int val) {
        if (node == null) {
            return val;
        }
        int min = Math.min(val, node.val);

        int minLeft = findMinValue(node.left, min);
        int minRight = findMinValue(node.right, min);

        return Math.min(min, Math.min(minLeft, minRight));
    }

    private int findMaxValue(TreeNode node, int val) {
        if (node == null) {
            return val;
        }
        int max = Math.max(val, node.val);

        int maxLeft = findMaxValue(node.left, max);
        int maxRight = findMaxValue(node.right, max);

        return Math.max(max, Math.max(maxLeft, maxRight));
    }
}
