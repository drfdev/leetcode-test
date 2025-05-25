package dev.drf.leetcode.convert.bst.to.greater.tree;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/convert-bst-to-greater-tree/
 */
public class ConvertBstToGreaterTreeProblem implements Problem {
    public TreeNode convertBST(TreeNode root) {
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
