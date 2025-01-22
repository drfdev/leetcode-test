package dev.drf.leetcode.increasing.order.search.tree;

import dev.drf.leetcode.Problem;

import java.util.LinkedList;

/**
 * https://leetcode.com/problems/increasing-order-search-tree/
 */
public class IncreasingOrderSearchTreeProblem implements Problem {
    public TreeNode increasingBST(TreeNode root) {
        var linked = new LinkedList<TreeNode>();
        depthSearch(linked, root);

        TreeNode previous = null;
        TreeNode first = null;
        for (TreeNode current : linked) {
            current.left = null;
            if (previous != null) {
                previous.right = current;
            }

            previous = current;
            if (first == null) {
                first = current;
            }
        }

        return first;
    }

    private void depthSearch(LinkedList<TreeNode> linked,
                             TreeNode node) {
        if (node == null) {
            return;
        }

        var left = node.left;
        var right = node.right;

        depthSearch(linked, left);
        linked.add(node);
        depthSearch(linked, right);
    }
}
