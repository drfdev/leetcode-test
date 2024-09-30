package dev.drf.leetcode.binary.tree.preorder.traversal;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 */
public class BinaryTreePreorderTraversalProblem implements Problem {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderTraversalProcess(result, root);
        return result;
    }

    private void preorderTraversalProcess(List<Integer> result,
                                          TreeNode node) {
        if (node == null) {
            return;
        }

        result.add(node.val);
        preorderTraversalProcess(result, node.left);
        preorderTraversalProcess(result, node.right);
    }
}
