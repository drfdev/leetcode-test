package dev.drf.leetcode.count.good.nodes.in.binary.tree;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/count-good-nodes-in-binary-tree/
 */
public class CountGoodNodesInBinaryTreeProblem implements Problem {
    public int goodNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        var counter = new Counter();
        var maxValue = Integer.MIN_VALUE;

        calculateGoodNodes(root, counter, maxValue);

        return counter.value;
    }

    private void calculateGoodNodes(TreeNode node, Counter counter, int maxValue) {
        if (node == null) {
            return;
        }
        var value = node.val;
        if (maxValue <= value) {
            counter.value++;
            maxValue = value;
        }

        calculateGoodNodes(node.left, counter, maxValue);
        calculateGoodNodes(node.right, counter, maxValue);
    }

    private static class Counter {
        int value = 0;
    }
}
