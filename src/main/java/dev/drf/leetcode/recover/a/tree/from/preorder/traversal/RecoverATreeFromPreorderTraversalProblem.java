package dev.drf.leetcode.recover.a.tree.from.preorder.traversal;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/recover-a-tree-from-preorder-traversal/
 */
public class RecoverATreeFromPreorderTraversalProblem implements Problem {
    private int index = 0;

    public TreeNode recoverFromPreorder(String traversal) {
        this.index = 0;
        return processNextNode(traversal, -1);
    }

    private TreeNode processNextNode(String traversal,
                                     int dashLevel) {
        if (index >= traversal.length()) {
            return null;
        }
        final int currentDashLevel = getDashLevel(traversal);
        if (currentDashLevel <= dashLevel) {
            return null;
        }
        index = index + currentDashLevel;
        final int value = getNumericValue(traversal);
        TreeNode node = new TreeNode(value);
        node.left = processNextNode(traversal, currentDashLevel);
        node.right = processNextNode(traversal, currentDashLevel);
        return node;
    }

    private int getDashLevel(String traversal) {
        int dashLevel = 0;
        while (traversal.charAt(index + dashLevel) == '-') {
            dashLevel++;
        }
        return dashLevel;
    }

    private int getNumericValue(String traversal) {
        int value = 0;
        while (index < traversal.length()
                && traversal.charAt(index) != '-') {
            value = value * 10;
            value = value + (traversal.charAt(index) - '0');
            index++;
        }
        return value;
    }
}
