package dev.drf.leetcode.lowest.common.ancestor.of.a.binary.tree;

import dev.drf.leetcode.Problem;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
 */
public class LowestCommonAncestorOfABinaryTreeProblem implements Problem {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) {
            return null;
        }

        Set<TreeNode> pNodes = new HashSet<>();
        fillPath(root, p, pNodes);

        Container container = new Container();
        findLCA(root, q, pNodes, container);
        return container.node;
    }

    private boolean fillPath(TreeNode node, TreeNode p, Set<TreeNode> nodes) {
        if (node == null) {
            return false;
        }
        if (node == p) {
            // TODO
            nodes.add(node);
            return true;
        }
        var leftPath = fillPath(node.left, p, nodes);
        if (leftPath) {
            nodes.add(node);
            return true;
        }
        var rightPath = fillPath(node.right, p, nodes);
        if (rightPath) {
            nodes.add(node);
            return true;
        }

        return false;
    }

    private boolean findLCA(TreeNode node, TreeNode q, Set<TreeNode> pNodes, Container container) {
        if (node == null) {
            return false;
        }
        if (node == q) {
            if (pNodes.contains(node) && container.node == null) {
                container.node = node;
            }
            return true;
        }

        var leftNode = findLCA(node.left, q, pNodes, container);
        if (leftNode) {
            if (pNodes.contains(node) && container.node == null) {
                container.node = node;
            }
            return true;
        }
        var rightNode = findLCA(node.right, q, pNodes, container);
        if (rightNode) {
            if (pNodes.contains(node) && container.node == null) {
                container.node = node;
            }
            return true;
        }

        return false;
    }

    private static class Container {
        private TreeNode node = null;
    }
}
