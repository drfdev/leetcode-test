package dev.drf.leetcode.smallest.subtree.with.all.the.deepest.nodes;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes/
 * Same problem: https://leetcode.com/problems/lowest-common-ancestor-of-deepest-leaves/
 * LowestCommonAncestorOfDeepestLeavesProblem
 * Let's try a better solution
 */
public class SmallestSubtreeWithAllTheDeepestNodesProblem implements Problem {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        LCAContainer container = new LCAContainer();
        findLCA(container, root, 0);
        return container.node;
    }

    private int findLCA(LCAContainer container,
                        TreeNode node,
                        int depth) {
        container.deepest = Math.max(depth, container.deepest);
        if (node == null) {
            return depth;
        }

        final int nextDepth = depth + 1;
        final int leftDepth = findLCA(container, node.left, nextDepth);
        final int rightDepth = findLCA(container, node.right, nextDepth);

        if (leftDepth == container.deepest
                && rightDepth == container.deepest) {
            container.node = node;
        }

        return Math.max(leftDepth, rightDepth);
    }

    private static final class LCAContainer {
        public int deepest = 0;
        public TreeNode node = null;
    }
}
