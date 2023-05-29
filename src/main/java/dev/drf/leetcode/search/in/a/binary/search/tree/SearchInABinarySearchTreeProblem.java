package dev.drf.leetcode.search.in.a.binary.search.tree;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/search-in-a-binary-search-tree/
 */
public class SearchInABinarySearchTreeProblem implements Problem {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        return searchNode(root, val);
    }

    private TreeNode searchNode(TreeNode node, int val) {
        if (node == null) {
            return null;
        }

        if (node.val == val) {
            return node;
        }

        var leftNode = searchNode(node.left, val);
        if (leftNode != null) {
            return leftNode;
        }

        var rightNode = searchNode(node.right, val);
        if (rightNode != null) {
            return rightNode;
        }

        return null;
    }
}
