package dev.drf.leetcode.subtree.of.another.tree;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/subtree-of-another-tree/
 */
public class SubtreeOfAnotherTreeProblem implements Problem {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }
        if (subRoot == null) {
            return true;
        }

        return searchSubTree(root, subRoot);
    }

    private boolean searchSubTree(TreeNode node, TreeNode subRoot) {
        if (node == null) {
            return false;
        }
        if (node.val == subRoot.val) {
            boolean mySubTree = checkSubTree(node, subRoot);
            if (mySubTree) {
                return true;
            }
        }

        boolean leftSearch = searchSubTree(node.left, subRoot);
        boolean rightSearch = searchSubTree(node.right, subRoot);

        return leftSearch || rightSearch;
    }

    private boolean checkSubTree(TreeNode node, TreeNode expected) {
        if (node == null && expected == null) {
            return true;
        }
        if (node == null || expected == null) {
            return false;
        }
        if (node.val != expected.val) {
            return false;
        }

        boolean leftSubTree = checkSubTree(node.left, expected.left);
        boolean rightSubTree = checkSubTree(node.right, expected.right);

        return leftSubTree && rightSubTree;
    }
}
