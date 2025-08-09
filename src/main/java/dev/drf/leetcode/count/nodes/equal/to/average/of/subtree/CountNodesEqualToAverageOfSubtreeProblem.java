package dev.drf.leetcode.count.nodes.equal.to.average.of.subtree;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree
 */
public class CountNodesEqualToAverageOfSubtreeProblem implements Problem {
    public int averageOfSubtree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int[] counter = {0};
        processNode(root, counter);
        return counter[0];
    }

    // [sum, count]
    private int[] processNode(TreeNode node,
                              int[] counter) {
        if (node == null) {
            return null;
        }

        int[] left = processNode(node.left, counter);
        int[] right = processNode(node.right, counter);

        int sum = node.val
                + (left != null ? left[0] : 0)
                + (right != null ? right[0] : 0);
        int count = 1
                + (left != null ? left[1] : 0)
                + (right != null ? right[1] : 0);
        int average = sum / count;
        if (node.val == average) {
            counter[0]++;
        }

        return new int[] {sum, count};
    }
}
