package dev.drf.leetcode.binary.tree.postorder.traversal;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-postorder-traversal/
 */
public class BinaryTreePostorderTraversalProblem implements Problem {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderTraversalProcess(result, root);
        return result;
    }

    private void postorderTraversalProcess(List<Integer> result,
                                           TreeNode node) {
        if (node == null) {
            return;
        }

        postorderTraversalProcess(result, node.left);
        postorderTraversalProcess(result, node.right);
        result.add(node.val);
    }
}
