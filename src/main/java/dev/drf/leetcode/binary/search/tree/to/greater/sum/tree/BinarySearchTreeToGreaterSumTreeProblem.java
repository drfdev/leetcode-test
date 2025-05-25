package dev.drf.leetcode.binary.search.tree.to.greater.sum.tree;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
 */
public class BinarySearchTreeToGreaterSumTreeProblem implements Problem {
    public TreeNode bstToGst(TreeNode root) {
        processNode(root, 0);
        return root;
    }

    private int processNode(TreeNode node, int sum) {
        if (node == null) {
            return sum;
        }

        var right = node.right;
        var left = node.left;

        var rightSum = processNode(right, sum);
        node.val += rightSum;
        return processNode(left, node.val);
    }
}
