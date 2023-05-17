package dev.drf.leetcode.binary.tree.inorder.traversal;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 */
@Deprecated
public class BinaryTreeInorderTraversalProblem implements Problem {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        addValue(result, root);

        return result;
    }

    private void addValue(List<Integer> result, TreeNode node) {
        if (node == null) {
            return;
        }

        /*
        "Inorder" understanding:
        https://leetcode.com/problems/binary-tree-inorder-traversal/solutions/3450106/recursive-approach-with-explanation-java/
         */
        addValue(result, node.left);
        result.add(node.val);
        addValue(result, node.right);
    }
}
