package dev.drf.leetcode.lowest.common.ancestor.of.a.binary.search.tree;

import dev.drf.leetcode.Problem;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 */
public class LowestCommonAncestorOfABinarySearchTreeProblem implements Problem {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Deque<TreeNode> pAncestors = new LinkedList<>();
        Deque<TreeNode> qAncestors = new LinkedList<>();

        buildAncestors(root, p, pAncestors);
        buildAncestors(root, q, qAncestors);

        TreeNode commonAncestor = null;
        while (!pAncestors.isEmpty() && !qAncestors.isEmpty()) {
            TreeNode pAncestor = pAncestors.pollLast();
            TreeNode qAncestor = qAncestors.pollLast();

            if (pAncestor == qAncestor) {
                commonAncestor = pAncestor;
            } else {
                break;
            }
        }
        return commonAncestor;
    }

    private void buildAncestors(TreeNode node, TreeNode expected, Deque<TreeNode> ancestors) {
        if (node == null) {
            return;
        }

        int currentValue = node.val;
        int expectedValue = expected.val;

        ancestors.push(node);

        if (currentValue == expectedValue) {
            return;
        }

        if (currentValue > expectedValue) {
            buildAncestors(node.left, expected, ancestors);
        } else {
            // currentValue < expectedValue
            buildAncestors(node.right, expected, ancestors);
        }
    }
}
